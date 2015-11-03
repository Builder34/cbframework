package cn.lcb.cbframework.service;

import cn.lcb.cbframework.util.BusinessException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public interface SysInfoUserService {

	/**
	 * 处理用户登录
	 * @param loginName
	 * @param password
	 * @param session
	 * @throws BusinessException  
	 */
	public void userLogin( String userName, String passWord,String code, HttpSession session ,HttpServletRequest request) 
			throws BusinessException;
}
