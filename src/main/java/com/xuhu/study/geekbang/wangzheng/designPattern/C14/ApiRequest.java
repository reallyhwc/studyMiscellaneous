package com.xuhu.study.geekbang.wangzheng.designPattern.C14;

/**
 * @author xuhu
 * @date 2021-04-03 10:51
 * API请求对象，DDD模式封装
 */
public class ApiRequest {

    private String baseUrl;

    private  String token;

    private  String appId;

    private long timestamp;

    /**
     * ApiRequest 全参数构造函数和
     * @param baseUrl baseUrl
     * @param token token
     * @param appId appId
     * @param timestamp timestamp
     */
    public ApiRequest(String baseUrl, String token, String appId, long timestamp){
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    /**
     * 创建by Url FULL版本
     * @param url url
     * @return ApiRequest
     */
    public static ApiRequest createFromFullUrl(String url){
        // TODO 有待填充实际信息
        // 包括从URL中拆解出来的 token、AppID等信息
        return new ApiRequest("","","",System.currentTimeMillis());
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
