package com.tencent.wxcloudrun.dto;

import lombok.Data;

import java.util.TreeMap;

/**
 * @Author: srf
 * @Date: 2023/3/7 21:42
 * @description:
 */
@Data
public class WechatTemplateMsg {
    /**
     * 消息
     */
    private String value;
    /**
     * 消息颜色
     */
    private String color;

    public WechatTemplateMsg(String value, String color) {
        this.value = value;
        this.color = color;
    }



}
