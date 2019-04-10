package com.wakeup.qcloud.listener.request;

import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.domain.IMMsgBody;
import com.wakeup.qcloud.domain.IMMsgContentDO;

import java.util.List;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class C2CCallbackSendMsgReq extends BaseDO {

	private static final long serialVersionUID = 7409073556227150334L;
	private String callbackCommand;
	private String fromAccount;
	private String operatorAccount;
	private String toAccount;
	private long random;
	private List<IMMsgBody<? extends IMMsgContentDO>> msgBody;
	

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

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

	public String getOperatorAccount() {
		return operatorAccount;
	}

	public void setOperatorAccount(String operatorAccount) {
		this.operatorAccount = operatorAccount;
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