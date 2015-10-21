package cn.lcb.cbframework.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/index.do")
public class IndexController {

	@RequestMapping
	public ModelAndView index() throws Exception{
		ModelAndView mv = new ModelAndView() ;
		mv.addObject("lcb", "luochengbiao") ;
		mv.setViewName("/home");
		return mv ;
	}
}
