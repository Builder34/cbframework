package cn.lcb.cbframework.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lcb.cbframework.dao.SysInfoUserDao;
import cn.lcb.cbframework.model.SysInfoUser;
import cn.lcb.cbframework.service.SysInfoUserService;
@Service("sysInfoUserService")
public class SysInfoUserServiceImpl implements SysInfoUserService {

	@Autowired
	public SysInfoUserDao sysInfoUserDao ;
	public SysInfoUserDao getSysInfoUserDao() {
		return sysInfoUserDao;
	}
	public void setSysInfoUserDao(SysInfoUserDao sysInfoUserDao) {
		this.sysInfoUserDao = sysInfoUserDao;
	}

	@Override
	public SysInfoUser getLoginInfo(Map<String, Object> params) {
		
		return sysInfoUserDao.getLoginInfo(params);
	}

}
