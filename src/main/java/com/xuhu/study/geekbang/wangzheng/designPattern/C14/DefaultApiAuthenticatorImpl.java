package com.xuhu.study.geekbang.wangzheng.designPattern.C14;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认API验证器实现类
 */
public class DefaultApiAuthenticatorImpl implements ApiAuthenticator {

    private CredentialStorage credentialStorage;

    public DefaultApiAuthenticatorImpl() {
        this.credentialStorage = new MysqlCredentialStorage();
    }

    public DefaultApiAuthenticatorImpl(CredentialStorage credentialStorage) {
        this.credentialStorage = credentialStorage;
    }

    /**
     * 验证 - 传入URL
     * @param url url
     */
    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.createFromFullUrl(url);
        auth(apiRequest);
    }

    /**
     * 验证 - 传入APIRequest
     * @param apiRequest APIRequest
     */
    @Override
    public void auth(ApiRequest apiRequest) {
        // 从APIRequest中拆解出来各种参数
        String appId = apiRequest.getAppId();
        String token = apiRequest.getToken();
        long timestamp = apiRequest.getTimestamp();
        String originalUrl = apiRequest.getBaseUrl();

        AuthToken clientAuthToken = new AuthToken(token, timestamp);
        if (clientAuthToken.isExpired()) {
            throw new RuntimeException("Token is expired.");
        }

        String password = credentialStorage.getPasswordByAppId(appId);

        Map<String, String> map = new HashMap<>();

        map.put("appId",appId);
        map.put("password",password);

        AuthToken serverAuthToken = AuthToken.create(originalUrl, timestamp, map);
        if (!serverAuthToken.match(clientAuthToken)) {
            throw new RuntimeException("Token verfication failed.");
        }
    }
}