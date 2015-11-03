package cn.lcb.cbframework.controller.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/index")
public class IndexController {


    @RequestMapping
	public ModelAndView index(HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView() ;
		mv.addObject("adminName",request.getSession().getAttribute("nickName") ) ;
		mv.setViewName("/main");

		return mv ;
	}
}
