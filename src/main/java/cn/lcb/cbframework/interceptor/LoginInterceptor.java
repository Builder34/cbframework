package cn.lcb.cbframework.interceptor;

import cn.lcb.cbframework.model.SysInfoUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 * Created by Builder34 on 2015-10-24.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class) ;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        SysInfoUser userInfo = (SysInfoUser)request.getSession().getAttribute("userInfo") ;
        logger.info("测试拦截器...") ;
       if( userInfo == null ){
           logger.info("未登录！");
           response.sendRedirect("/login");
           return false ;
       }
        return true ;
    }
}
