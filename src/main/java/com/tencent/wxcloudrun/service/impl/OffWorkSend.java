package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.config.SendTypeRequest;
import com.tencent.wxcloudrun.config.WxSendMessageUtils;
import com.tencent.wxcloudrun.dto.WechatTemplateMsg;
import com.tencent.wxcloudrun.service.WxChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: srf
 * @Date: 2023/3/7 21:34
 * @description:
 */
@Service("OffWorkSend")
public class OffWorkSend implements WxChatService {
    @Autowired
    protected WxSendMessageUtils wxSendMessageUtils;

    @Override
    public void sendTest(SendTypeRequest send) {

        // 下班模板Id
        String templateId = "oxYZY6zf91VquhhgMPfRdNHU5ye0";
        // 模板参数
        Map<String, WechatTemplateMsg> sendMag = new HashMap<String, WechatTemplateMsg>();
        sendMag.put("offWork", new WechatTemplateMsg("宝~马上就要下班咯，收拾好随身物品准备早退啦！","#b89485"));
        // 发送
        wxSendMessageUtils.send(send.getOpenId(), templateId, sendMag);
    }
}
