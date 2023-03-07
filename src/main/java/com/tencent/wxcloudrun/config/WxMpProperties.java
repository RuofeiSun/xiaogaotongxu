package com.tencent.wxcloudrun.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: srf
 * @Date: 2023/3/7 16:42
 * @description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "wx.mp.configs")
public class WxMpProperties {
    /**
            * 设置微信公众号的appid
         */
    private String appId;

    /**
     * 设置微信公众号的app secret
     */
    private String secret;

    /**
     * 设置微信公众号的token
     */
    private String token;

}
