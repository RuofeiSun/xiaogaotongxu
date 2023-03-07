package com.tencent.wxcloudrun.config;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: srf
 * @Date: 2023/3/7 21:36
 * @description:
 */
@Data
@AllArgsConstructor
public class SendTypeRequest {

    /**
     * 推送类型
     * */
    private String type;

    /**
     * 接收人的openId
     * */
    private String openId;

}


