package com.xuhu.study.geekbang.wangzheng.designPattern.C14;


/**
 * API 验证器接口
 */
public interface ApiAuthenticator {

    /**
     * 验证 - 传入URL
     * @param url url
     */
    void auth(String url);

    /**
     * 验证 - 传入APIRequest
     * @param apiRequest APIRequest
     */
    void auth(ApiRequest apiRequest);

}