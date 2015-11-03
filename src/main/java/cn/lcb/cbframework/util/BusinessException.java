package cn.lcb.cbframework.util;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 6023368911250240589L;
	
	
	public BusinessException(String message){
		super(message) ;  //错误信息
	}
	
}
