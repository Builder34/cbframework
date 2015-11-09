package cn.lcb.cbframework.dao;

import java.util.Map;

import cn.lcb.cbframework.common.BaseDao;
import cn.lcb.cbframework.model.SysInfoUser;

public interface SysInfoUserDao extends BaseDao {

	public SysInfoUser getLoginInfo(Map<String,Object> params) ;
}
