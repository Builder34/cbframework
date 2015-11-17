package cn.lcb.cbframework.service;

import java.util.List;
import java.util.Map;

import cn.lcb.cbframework.model.RegisterUser;

public interface RegisterUserService   {

	/**
	 * 列表信息
	 * */
	public List<RegisterUser> getPageInfoList(Map<String,Object> params) ;
	/**
	 * 列表count
	 * */
	public Integer getPageInfoListCount(Map<String,Object> params) ;
}
