package cn.lcb.cbframework.dao;

import java.util.List;
import java.util.Map;

import cn.lcb.cbframework.model.RegisterUser;

public interface RegisterUserDao   {

	/**
	 * 注册账号（用户）
	 * */
	public Integer registerAccount(RegisterUser registerUser) throws Exception ;
	/**
	 * 根据用户id查询详细信息
	 * */
	public RegisterUser findById(Integer userId) throws Exception ;
	
	/**
	 * 列表信息
	 * */
	public List<RegisterUser> getPageInfoList(Map<String,Object> params) ;
	/**
	 * 列表count
	 * */
	public Integer getPageInfoListCount(Map<String,Object> params) ;
	
}
