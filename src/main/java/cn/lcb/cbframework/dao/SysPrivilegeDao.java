package cn.lcb.cbframework.dao;

import java.util.List;

import cn.lcb.cbframework.model.SysPrivilege;

public interface SysPrivilegeDao {
	
	public List<SysPrivilege> getsysprivilegeByUserId(long userId) ;
}
