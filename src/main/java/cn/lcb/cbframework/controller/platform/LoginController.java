package cn.lcb.cbframework.controller.platform;

import cn.lcb.cbframework.service.ManagerService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public ManagerService ManagerService ;
    public ManagerService getManagerService() {
        return ManagerService;
    }
    public void setManagerService(ManagerService managerService) {
        ManagerService = managerService;
    }

    @RequestMapping
    public ModelAndView toLogin() throws Exception{
        ModelAndView mv = new ModelAndView() ;
        mv.setViewName("/main") ;
        mv.addObject("login","login") ;

        return mv ;
    }

    @RequestMapping(value="verify",produces="application/json;charset=utf-8")
    public ModelAndView verify(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mv = new ModelAndView() ;
        String nickName = request.getParameter("nickName") ;
        String loginpassword = request.getParameter("loginpassword") ;
        if(this.getManagerService().checkLogin(nickName,loginpassword)){
            request.getSession().setAttribute("nickName",nickName) ;
            //response.sendRedirect("/index") ;
            mv.setViewName("/main") ;
            logger.info("登录成功");
            return mv ;
        }else{
            logger.info("登录失败,用户名或密码错误!");
            mv.setViewName("/login");
            mv.addObject("message","用户名或密码错误！");
            return mv ;
        }
    }
    @RequestMapping("logout")
    public void logout(HttpServletRequest request , HttpServletResponse response ) throws Exception {
        request.getSession().removeAttribute("nickName") ;
        response.sendRedirect("/index") ;
    }
}
