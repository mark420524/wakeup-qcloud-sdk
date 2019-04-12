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
	private Integer MsgRandom;//消息id
	private Integer MsgTime;

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
		return MsgRandom;
	}

	public void setMsgRandom(Integer msgRandom) {
		MsgRandom = msgRandom;
	}

	public Integer getMsgTime() {
		return MsgTime;
	}

	public void setMsgTime(Integer msgTime) {
		MsgTime = msgTime;
	}
}
