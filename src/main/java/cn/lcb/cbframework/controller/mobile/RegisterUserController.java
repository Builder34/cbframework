package cn.lcb.cbframework.controller.mobile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.lcb.cbframework.common.FunctionURL;
import cn.lcb.cbframework.common.PlatformURL;
/**
 * m站用户注册Controller
 * */
@Controller
@RequestMapping(PlatformURL.WECHAT)
public class RegisterUserController {

	private Logger logger = LoggerFactory.getLogger(this.getClass()) ;
	
	@RequestMapping(value=FunctionURL.ADD)
	public ModelAndView toRegister(){
		ModelAndView mv = new ModelAndView() ;
		mv.setViewName("/mobile/registeruer/adddOrEdit"); 
		return mv ;
	}
	
	@RequestMapping(value=FunctionURL.SAVE)
	@ResponseBody
	public String save(){
		
		return null ;
	}
	
}
