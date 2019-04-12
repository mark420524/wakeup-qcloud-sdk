package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by chenglin on 2019/4/12.
 */
public class StateChangeDO extends BaseDO{

	private static final long serialVersionUID = -4315438742179365709L;
	@JSONField(name="To_Account")
	private String toAccount;
	@JSONField(name="Action")
	private String action;
	@JSONField(name="Reason")
	private String reason;


	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
