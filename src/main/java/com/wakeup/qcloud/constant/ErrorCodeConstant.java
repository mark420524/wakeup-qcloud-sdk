package com.wakeup.qcloud.constant;

//tx群内发言回调
public class ErrorCodeConstant {

	public static final Integer ERROR_CODE_OK =  0 ;//允许发言. 允许用户发言，同时也不修改即将下发的消息的内容。
	
	public static final Integer ERROR_CODE_REJECT = 1;//禁止发言. 不允许用户发言，该消息将不会下发，同时给调用方返回错误码：10016。
	
	public static final Integer ERROR_CODE_SILIENCESEND = 2;//静默丢弃. 不允许用户发言，该消息将不会下发，但会给调用方返回成功，使调用方以为消息已经发出。
}
