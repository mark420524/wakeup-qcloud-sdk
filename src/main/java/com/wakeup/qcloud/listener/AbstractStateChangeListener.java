package com.wakeup.qcloud.listener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wakeup.qcloud.constant.CallbackCommand;
import com.wakeup.qcloud.listener.request.CallbackStateChangeReq;
import com.wakeup.qcloud.listener.response.C2CCallbackBeforeSendMsgResp;

import java.util.Map;

/**
 * Created by chenglin on 2019/4/12.
 */
public abstract class AbstractStateChangeListener implements QCloudMsgListener {
    public abstract QCloudMsgResponse onInvalidRequest(String body,Map<String, Object> urlParams);
    /**
     *状态变更回调
     */
    public IMMsgResponse onCallbackStateChangeReq(CallbackStateChangeReq msgReq, UrlParamDO urlParams) {
        return new IMMsgResponse();
    }
    @Override
    public QCloudMsgResponse doProcess(String body, Map<String, Object> urlParams, String key) {
        Object sdkAppid = urlParams.get("SdkAppid");
        if(sdkAppid ==null || !sdkAppid.toString().equals(key)){
            return onInvalidRequest(body, urlParams);
        }

        UrlParamDO paramDO = JSON.parseObject(JSON.toJSONString(urlParams), UrlParamDO.class);
        switch (paramDO.getCallbackCommond()) {
            case CallbackCommand.CallbackStateChange:
                CallbackStateChangeReq msgReq5 = toCallbackStateChangeReq(body);
                return onCallbackStateChangeReq(msgReq5, paramDO);
            default:
                break;
        }
        return null;
    }
//{"CallbackCommand":"State.StateChange","Info":{"To_Account":"100000017","Action":"Login","Reason":"Register"}}
    private CallbackStateChangeReq toCallbackStateChangeReq(String body){
        JSONObject jsonObject = JSON.parseObject(body);
        CallbackStateChangeReq msgReq = new CallbackStateChangeReq();
        msgReq.setCallbackCommand(jsonObject.getString("CallbackCommand"));
        msgReq.setInfo(jsonObject.getString("Info"));
        return msgReq;
    }
}
