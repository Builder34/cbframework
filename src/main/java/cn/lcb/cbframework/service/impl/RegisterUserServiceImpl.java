package cn.lcb.cbframework.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lcb.cbframework.dao.RegisterUserDao;
import cn.lcb.cbframework.service.RegisterUserService;

@Service
public class RegisterUserServiceImpl implements RegisterUserService{

	@Autowired
	private RegisterUserDao registerUserDao ;
	public RegisterUserDao getRegisterUserDao() {
		return registerUserDao;
	}
	public void setRegisterUserDao(RegisterUserDao registerUserDao) {
		this.registerUserDao = registerUserDao;
	}

	@Override
	public List getPageInfoList(Map<String, Object> params) {
		
		return this.registerUserDao.getPageInfoList(params) ;
	}

	@Override
	public Integer getPageInfoListCount(Map<String, Object> params) {
		
		return this.registerUserDao.getPageInfoListCount(params) ;
	}

}
