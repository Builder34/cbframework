package cn.lcb.cbframework.dao;

import java.util.Map;

import cn.lcb.cbframework.model.SysInfoUser;
import cn.lcb.cbframework.util.BaseDao;

public interface SysInfoUserDao extends BaseDao {

	public SysInfoUser getLoginInfo(Map<String,Object> params) ;
}
