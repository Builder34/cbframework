package cn.lcb.cbframework.controller.platform;

import cn.lcb.cbframework.model.SysInfoUser;
import cn.lcb.cbframework.service.SysInfoUserService;
import cn.lcb.cbframework.util.BusinessException;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Builder34 on 2015-10-25.
 */
@Controller
@RequestMapping("/login")
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
	@RequestMapping
    public ModelAndView toLogin() throws Exception{
        ModelAndView mv = new ModelAndView() ;
        mv.setViewName("/login") ;

        return mv ;
    }
	/**
	 * 验证登录
	 * */
    @RequestMapping(value="verify",produces="application/json;charset=utf-8")
    @ResponseBody
    public String verify(String loginname,String password,HttpServlet session,HttpServletRequest request){
    	try{
    		
    	}catch(BusinessException e){
    		e.printStackTrace();
    	}
    	return null ;
    }
    /**
     * 退出登录
     * */
    @RequestMapping("logout")
    public void logout(HttpServletRequest request , HttpServletResponse response ) throws Exception {
        request.getSession().removeAttribute("nickName") ;
        response.sendRedirect("/index") ;
    }
}
