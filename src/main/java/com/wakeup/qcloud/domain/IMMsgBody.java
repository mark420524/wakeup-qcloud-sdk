package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMMsgBody<T extends IMMsgContentDO> {

	@JSONField(name = "MsgContent")
	private T msgContent;
	
	@JSONField(name = "MsgType")
	private String msgType;

	@JSONField(name = "MsgRandom")
	private Integer msgRandom;//消息id
	@JSONField(name = "MsgTime")
	private Integer msgTime;

	public T getMsgContent() {
		return msgContent;
	}

	public void setMsgContent(T msgContent) {
		this.msgContent = msgContent;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Integer getMsgRandom() {
		return msgRandom;
	}

	public void setMsgRandom(Integer msgRandom) {
		this.msgRandom = msgRandom;
	}

	public Integer getMsgTime() {
		return msgTime;
	}

	public void setMsgTime(Integer msgTime) {
		this.msgTime = msgTime;
	}
}
