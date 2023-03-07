package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.config.SendTypeRequest;

import java.util.concurrent.ExecutionException;

/**
 * @Author: srf
 * @Date: 2023/3/7 21:34
 * @description:
 */
public interface WxChatService {
    /**
     * 向一个用户推送消息（测试）
     * @param
     */
    void sendTest(SendTypeRequest send) throws ExecutionException, InterruptedException;
}
