package cn.lcb.cbframework.common;


public enum MsgCode {
	LOGINERROR(204,"登录失败");
	
	private int id ;
	private String message;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	private MsgCode(int id,String message) {
		this.setId(id);
		this.setMessage(message);
	}
}
