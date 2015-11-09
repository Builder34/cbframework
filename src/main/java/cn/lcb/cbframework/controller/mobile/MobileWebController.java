package cn.lcb.cbframework.controller.mobile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lcb.cbframework.common.FunctionURL;
import cn.lcb.cbframework.common.PlatformURL;

/**
 * Created by Builder34 on 2015-10-31.
 */
@Controller
@RequestMapping(PlatformURL.WECHAT)
public class MobileWebController {
    private Logger logger = LoggerFactory.getLogger(this.getClass()) ;

    @RequestMapping(value=FunctionURL.LOGIN)
    public ModelAndView toLogin() throws Exception {
        ModelAndView mv = new ModelAndView() ;
        mv.setViewName("/mobile/login");
        logger.info("跳转到m站登录页...");
        return mv ;
    }
}
