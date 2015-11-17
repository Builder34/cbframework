package cn.lcb.cbframework.dao;

import java.util.Map;

import cn.lcb.cbframework.model.SysInfoUser;

public interface SysInfoUserDao   {

	public SysInfoUser getLoginInfo(Map<String,Object> params) ;
}
