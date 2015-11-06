package cn.lcb.cbframework.dao;

import cn.lcb.cbframework.model.RegisterUser;
import cn.lcb.cbframework.util.BaseDao;

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
