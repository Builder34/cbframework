package cn.lcb.cbframework.controller.platform;


import cn.lcb.cbframework.common.BusinessException;
import cn.lcb.cbframework.common.FunctionURL;
import cn.lcb.cbframework.common.MsgCode;
import cn.lcb.cbframework.common.PlatformURL;
import cn.lcb.cbframework.service.SysInfoUserService;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Builder34 on 2015-10-25.
 */
@Controller
@RequestMapping(PlatformURL.ADMIN)
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass()) ;

    @Autowired
    public SysInfoUserService sysInfoUserService ;
    public SysInfoUserService getSysInfoUserService() {
		return sysInfoUserService;
	}
	public void setSysInfoUserService(SysInfoUserService sysInfoUserService) {
		this.sysInfoUserService = sysInfoUserService;
	}
	/**
	 * 跳转到登陆页
	 * */
	@RequestMapping(value=FunctionURL.LOGIN)
    public ModelAndView toLogin() throws Exception{
        ModelAndView mv = new ModelAndView() ;
        mv.setViewName("/login") ;
        return mv ;
    }
	/**
	 * 验证登录
	 * */
    @RequestMapping(value=FunctionURL.LOGIN_VERIFY,produces="application/json;charset=utf-8")
    @ResponseBody
    public String verify(String loginName,String loginPassword,String clickCode,HttpSession session,HttpServletRequest request,HttpServletResponse response){
    	try{
    		boolean flag = this.sysInfoUserService.userLogin(loginName,loginPassword,clickCode,session,request) ;
            if (flag) { 
                try {
                    response.sendRedirect("/index");
                    return "" ;
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            //获取上次登录时间-->第一次登录：上次登录时间为0
            //
    	}catch(BusinessException e){
    		e.printStackTrace();
    	}
    	Map<String,Object> results =new HashMap<String,Object>() ;
    	results.put("msgCode", MsgCode.LOGINERROR.getId()) ;
    	
    	return JSONObject.toJSONString(results) ;  //TODO:这里需要优化
    }
    /**
     * 注销登录
     * */
    @RequestMapping(value=FunctionURL.LOGOUT)
    public void logout(HttpServletRequest request , HttpServletResponse response ) throws Exception {
        request.getSession().removeAttribute("nickName") ;
        response.sendRedirect("/index") ;
    }
}
