package cn.lcb.cbframework.dao;

import cn.lcb.cbframework.common.BaseDao;
import cn.lcb.cbframework.model.RegisterUser;

public interface RegisterUserDao extends BaseDao {

	/**
	 * 注册账号（用户）
	 * */
	public Integer registerAccount(RegisterUser registerUser) throws Exception ;
	/**
	 * 根据用户id查询详细信息
	 * */
	public RegisterUser findById(Integer userId) throws Exception ;
	
	
}
