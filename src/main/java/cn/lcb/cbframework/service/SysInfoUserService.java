package cn.lcb.cbframework.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cn.lcb.cbframework.common.BusinessException;


public interface SysInfoUserService {

	/**
	 * 处理用户登录
	 * @param loginName
	 * @param password
	 * @param session
	 * @throws BusinessException  
	 */
	public boolean userLogin( String userName, String passWord,String code, HttpSession session ,HttpServletRequest request)
			throws BusinessException;
}
