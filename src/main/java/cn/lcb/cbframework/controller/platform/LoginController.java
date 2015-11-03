package cn.lcb.cbframework.controller.platform;

import cn.lcb.cbframework.model.SysInfoUser;
import cn.lcb.cbframework.service.SysInfoUserService;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

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
	
	@RequestMapping
    public ModelAndView toLogin() throws Exception{
        ModelAndView mv = new ModelAndView() ;
        //mv.setViewName("/main") ;
        //mv.addObject("login","login") ;
        Map<String,Object> params = new HashMap<String,Object>() ;
        params.put("userName", "admin") ;
        params.put("passWord", "admin") ;
        SysInfoUser user = sysInfoUserService.getLoginInfo(params) ;
        System.out.println("______#####"+user) ;
        return mv ;
    }

//    @RequestMapping(value="verify",produces="application/json;charset=utf-8")
//    public ModelAndView verify(HttpServletRequest request,HttpServletResponse response) throws Exception{
//        ModelAndView mv = new ModelAndView() ;
//        String nickName = request.getParameter("nickName") ;
//        String loginpassword = request.getParameter("loginpassword") ;
//        if(this.getManagerService().checkLogin(nickName,loginpassword)){
//            request.getSession().setAttribute("nickName",nickName) ;
//            //response.sendRedirect("/index") ;
//            mv.setViewName("/main") ;
//            logger.info("登录成功");
//            return mv ;
//        }else{
//            logger.info("登录失败,用户名或密码错误!");
//            mv.setViewName("/login");
//            mv.addObject("message","用户名或密码错误！");
//            return mv ;
//        }
//    }
    @RequestMapping("logout")
    public void logout(HttpServletRequest request , HttpServletResponse response ) throws Exception {
        request.getSession().removeAttribute("nickName") ;
        response.sendRedirect("/index") ;
    }
}
