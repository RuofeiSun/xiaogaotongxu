package com.tencent.wxcloudrun.config;

import com.tencent.wxcloudrun.dto.WechatTemplateMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: srf
 * @Date: 2023/3/7 21:35
 * @description:
 */
@Component
public class WxSendMessageUtils {
    //获取Access_Token工具类
    @Autowired
    protected WeChetAccessToken weChetAccessToken;

    //restTemplate的请求方式
    @Autowired
    protected RestTemplate restTemplate;
    public static String Access_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid={0}&secret={1}";
    public static String Send_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

    /**
     * 发送方法
     * */
    public String send(String openId, String templateId, Map<String, WechatTemplateMsg> data) {
        String accessToken = weChetAccessToken.getToken();
        //System.out.println("send方法里的token："+accessToken);
        String url = Send_URL.replace("ACCESS_TOKEN", accessToken);
        //String url = "http://api.weixin.qq.com/cgi-bin/message/template/send";
        //拼接base参数
        System.out.println("调用的接口地址为:"+url);
        Map<String, Object> sendBody = new HashMap<>();
        sendBody.put("touser", openId);               // openId
        sendBody.put("url","www.baidu.com");          // 跳转url
        sendBody.put("topcolor", "#FF0000");          // 顶色
        sendBody.put("data", data);                   // 模板参数
        sendBody.put("template_id", templateId);      // 模板Id
        ResponseEntity<String> forEntity = restTemplate.postForEntity(url, sendBody, String.class);
        System.out.println("响应："+forEntity.getBody());
        return forEntity.getBody();
    }
}
