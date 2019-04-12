package com.wakeup.qcloud.listener.request;

import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.domain.IMMsgBody;
import com.wakeup.qcloud.domain.IMMsgContentDO;

import java.util.List;

/**
 * Created by chenglin on 2019/4/12.
 */
public class StateChangeReq extends BaseDO{
    private static final long serialVersionUID=5409063556227850934L;
    private String callbackCommand;
    private String fromAccount;
    private String toAccount;
    private long random;
    private List<IMMsgBody<? extends IMMsgContentDO>> msgBody;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public long getRandom() {
        return random;
    }

    public void setRandom(long random) {
        this.random = random;
    }

    public List<IMMsgBody<? extends IMMsgContentDO>> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<IMMsgBody<? extends IMMsgContentDO>> msgBody) {
        this.msgBody = msgBody;
    }
}
