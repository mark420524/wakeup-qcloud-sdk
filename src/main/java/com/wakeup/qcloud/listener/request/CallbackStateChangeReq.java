package com.wakeup.qcloud.listener.request;

import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.domain.IMMsgBody;
import com.wakeup.qcloud.domain.IMMsgContentDO;

import java.util.List;

/**
 * Created by chenglin on 2019/4/12.
 */
public class CallbackStateChangeReq extends BaseDO{
    private static final long serialVersionUID=5409063556227850934L;
    private String callbackCommand;
    private String info;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
