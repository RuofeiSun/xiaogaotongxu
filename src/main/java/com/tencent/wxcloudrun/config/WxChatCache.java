package com.tencent.wxcloudrun.config;

/**
 * @Author: srf
 * @Date: 2023/3/7 16:41
 * @description:
 */
public class WxChatCache {

    /**
     * 微信 accessToken缓存
     */
    public static class AccessToken {
        public static String token = null;   // accessToken
        public static Long expiration = 0L;  // accessToken 过期时间(获取的token 默认有效期2小时）
    }

}
