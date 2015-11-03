package cn.lcb.cbframework.util;

import java.util.Map;

public interface BaseDao {

	/**
	 * 列表信息
	 * */
	public Map<String,Object> getPageInfoList(Map<String,Object> params) ;
	/**
	 * 列表count
	 * */
	public Integer getPageInfoListCount(Map<String,Object> params) ;
}
