package cn.lcb.cbframework.controller.mobile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Builder34 on 2015-10-31.
 */
@Controller
@RequestMapping("/mobile")
public class MobileWebController {
    private Logger logger = LoggerFactory.getLogger(this.getClass()) ;

    @RequestMapping("login")
    public ModelAndView toLogin() throws Exception {
        ModelAndView mv = new ModelAndView() ;
        mv.setViewName("/mobile/login");

        return mv ;
    }
}
