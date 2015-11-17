package cn.lcb.cbframework.common;

import java.util.List;
import java.util.Map;

public interface BaseService {

	/**
	 * 列表信息
	 * */
	public List getPageInfoList(Map<String,Object> params) ;
	/**
	 * 列表count
	 * */
	public Integer getPageInfoListCount(Map<String,Object> params) ;
	
}
