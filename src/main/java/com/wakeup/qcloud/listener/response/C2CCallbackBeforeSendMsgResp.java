package com.wakeup.qcloud.listener.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.IMMsgBody;
import com.wakeup.qcloud.domain.IMMsgContentDO;
import com.wakeup.qcloud.listener.IMMsgResponse;

import java.util.List;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class C2CCallbackBeforeSendMsgResp extends IMMsgResponse{

	private static final long serialVersionUID = -5705685705134855859L;
	@JSONField(name = "MsgBody")
	private List<IMMsgBody<? extends IMMsgContentDO>> msgBody;

	public List<IMMsgBody<? extends IMMsgContentDO>> getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(List<IMMsgBody<? extends IMMsgContentDO>> msgBody) {
		this.msgBody = msgBody;
	}
}
