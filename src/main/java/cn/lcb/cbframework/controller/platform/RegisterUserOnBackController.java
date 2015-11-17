package cn.lcb.cbframework.controller.platform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lcb.cbframework.common.FunctionURL;
import cn.lcb.cbframework.common.PlatformURL;
import cn.lcb.cbframework.model.RegisterUser;
import cn.lcb.cbframework.service.RegisterUserService;

@Controller
@RequestMapping(value=PlatformURL.ADMIN+"/registeruser")
public class RegisterUserOnBackController {

	private Logger logger = LoggerFactory.getLogger(getClass()) ;
	
	@Resource
	private RegisterUserService registerUserService ;
	public RegisterUserService getRegisterUserService() {
		return registerUserService;
	}
	public void setRegisterUserService(RegisterUserService registerUserService) {
		this.registerUserService = registerUserService;
	}


	@RequestMapping(value=FunctionURL.LISTDATA)
	@ResponseBody
	public String listData(HttpServletRequest request) {
		Map<String, Object> params = new HashMap<String,Object>() ;
		params.put("start", 0) ;
		params.put("pageSize", 15) ;
		List<RegisterUser> data = this.registerUserService.getPageInfoList(params) ; 
		
		return JSON.toJSONString(data) ;
	}
}
