package com.wakeup.qcloud.constant;
/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class CallbackCommand {

	/**
	 * 群内发言之前回调
	 */
	public final static String GroupCallbackBeforeSendMsg = "Group.CallbackBeforeSendMsg";
	
	/**
	 * 群内发言之后回调
	 */
	public final static String GroupCallbackAfterSendMsg = "Group.CallbackAfterSendMsg";
	/**
	 * 新成员入群之后回调
	 */
	public final static String GroupCallbackAfterNewMemberJoin = "Group.CallbackAfterNewMemberJoin";
	
	/**
	 * 群成员离开之后回调
	 */
	public final static String GroupCallbackAfterMemberExit = "Group.CallbackAfterMemberExit";

	/**
	 *发单聊消息之前回调
	 */
	public final static String C2CCallbackBeforeSendMsg="C2C.CallbackBeforeSendMsg";

	/**
	 *发单聊消息之后回调
	 */
	public final static String C2CCallbackAfterSendMsg="C2C.CallbackAfterSendMsg";

	/**
	 *状态变更回调
	 */
	public final static String CallbackStateChange="State.StateChange";
}
