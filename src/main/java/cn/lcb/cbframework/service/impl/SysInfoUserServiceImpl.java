package cn.lcb.cbframework.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.lcb.cbframework.common.BusinessException;
import cn.lcb.cbframework.dao.SysInfoUserDao;
import cn.lcb.cbframework.dao.SysPrivilegeDao;
import cn.lcb.cbframework.model.SysInfoUser;
import cn.lcb.cbframework.model.SysPrivilege;
import cn.lcb.cbframework.service.SysInfoUserService;
import cn.lcb.cbframework.util.UserInfo;

@Service("sysInfoUserService")
public class SysInfoUserServiceImpl implements SysInfoUserService {

	@Autowired
	public SysInfoUserDao sysInfoUserDao ;  //登录用户dao
//	@Autowired
//	public SysPrivilegeDao sysPrivilegeDao ;  //权限dao 
	public SysInfoUserDao getSysInfoUserDao() {
		return sysInfoUserDao;
	}
	public void setSysInfoUserDao(SysInfoUserDao sysInfoUserDao) {
		this.sysInfoUserDao = sysInfoUserDao;
	}
//	public SysPrivilegeDao getSysPrivilegeDao() {
//		return sysPrivilegeDao;
//	}
//	public void setSysPrivilegeDao(SysPrivilegeDao sysPrivilegeDao) {
//		this.sysPrivilegeDao = sysPrivilegeDao;
//	}
	
	@Override
	public boolean userLogin(String userName, String passWord, String code, HttpSession session,HttpServletRequest request) throws BusinessException {
		boolean flag = false ; //登录标记
		Object codeObj = session.getAttribute("code") ;
		if(!code.equals(codeObj)){
            System.out.println(codeObj+"****输入的："+code) ;
			throw new BusinessException("验证码错误！") ;
		}
		//登录前先清空session
		UserInfo.destory(session);
		//传递参数
		Map<String,Object> params = new HashMap<String,Object>() ;
		params.put( "userName" , userName ) ;
		params.put( "passWord" , passWord ) ;
		SysInfoUser sysInfoUser = this.sysInfoUserDao.getLoginInfo(params) ;
		if(sysInfoUser==null){
			//没有该用户
			throw new BusinessException("账号或密码错误！") ;
		}else if(sysInfoUser.getIsUsed() != SysInfoUser.STATUS_NOMAL){
			//管理员被冻结
			throw new BusinessException("用户被冻结！");
		}else{
			//正常登录，获取用户所有角色，所有权限
			//List<SysPrivilege> sysPrivilege = sysPrivilegeDao.getsysprivilegeByUserId(sysInfoUser.getUserId()) ;
			//设置session
			UserInfo.setUserSession(session, sysInfoUser, null) ;
            flag = true ; //用户登录检验成功
		}
        return flag ;
	}

}
