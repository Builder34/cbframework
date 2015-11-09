package cn.lcb.cbframework.controller.platform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.lcb.cbframework.common.FunctionURL;
import cn.lcb.cbframework.common.PlatformURL;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(PlatformURL.ADMIN)
public class IndexController {


    @RequestMapping(value=FunctionURL.INDEX)
	public ModelAndView index(HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView() ;
		mv.addObject("adminName",request.getSession().getAttribute("nickName") ) ;
		mv.setViewName("/main");

		return mv ;
	}
}
