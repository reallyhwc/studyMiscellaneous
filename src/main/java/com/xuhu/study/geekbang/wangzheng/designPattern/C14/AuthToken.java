package com.xuhu.study.geekbang.wangzheng.designPattern.C14;

import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;
import org.apache.tomcat.util.security.MD5Encoder;

import java.util.Map;

/**
 * @author xuhu
 * @date 2021-04-01 23:11
 * 验证 token对象
 */
public class AuthToken {

    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 60 * 1000L;

    private String token;

    private long createTime;

    private long expireTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, long createTime){
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expireTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expireTimeInterval = expireTimeInterval;
    }

    public static AuthToken create(String baseUrl, long createTime, Map<String, String> params){
        // 根据以上几个巴拉巴拉参数生成一个token（这里为了方便简单实用一个md5好了）
        StringBuilder sb = new StringBuilder();
        sb.append(baseUrl).append(createTime).append(JSONObject.toJSONString(params));
        String md5String = MD5Encoder.encode(sb.toString().getBytes());
        // TODO  这里看起来似乎缺了一层 - 根据APPId来判断加密算法
        return new AuthToken(md5String, createTime, DEFAULT_EXPIRED_TIME_INTERVAL);
    }

    public String getToken() {
        return token;
    }

    public boolean isExpired(){
        return createTime + expireTimeInterval < System.currentTimeMillis();
    }

    public boolean match(AuthToken authToken){
        return false;
    }

}
