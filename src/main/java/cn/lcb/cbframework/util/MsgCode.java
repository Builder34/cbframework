package cn.lcb.cbframework.util;


public enum MsgCode {
	LOGINERROR(200,"登录失败");
	
	private int msgCode ;
	private String message;
	
	public int getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(int msgCode) {
		this.msgCode = msgCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	private MsgCode(int msgCode,String message) {
		this.setMsgCode(msgCode);
		this.setMessage(message);
	}
}
