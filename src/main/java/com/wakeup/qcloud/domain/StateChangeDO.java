package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class StateChangeDO extends BaseDO{

	private static final long serialVersionUID = -4315438742179365709L;
	@JSONField(name="To_Account")
	private String To_Account;
	@JSONField(name="Action")
	private String Action;
	@JSONField(name="Reason")
	private String Reason;

	public String getTo_Account() {
		return To_Account;
	}

	public void setTo_Account(String to_Account) {
		To_Account = to_Account;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}
}
