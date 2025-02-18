package com.sk.tango.passkey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.tango.passkey.model.UserInfo;
import com.sk.tango.passkey.service.PasskeyService;

@RestController
@RequestMapping("/")
public class PasskeyController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PasskeyService service;
	
//	@GetMapping("/test")
//	public ModelAndView test() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("test");
//		return mv;
//	}
	
//	@GetMapping("/test")
//	public String test() {
//		return "test";
//	}
	
//	@PostMapping("/oauth2/getoken")
//	public void getOauth2(OAuthToken oauthToken) {
//		logger.info("oauthToken = "+oauthToken);
//		//service.getOAuthToken();
//	}
	
	@PostMapping("/oauth2/getoken")
	public String getOauth2(UserInfo userInfo) {
		logger.info("PasskeyController.getOauth2() ==================");
		logger.info("==> userInfo = "+ userInfo.toString());
		
		service.getOauth2(userInfo);
//		
//		grantType: "client_credentials",
//		scope: "passkey:rp",
		
		return "test";
	}
	
//	@PostMapping("/oauth2/getoken")
//	public OAuthToken getOauth2(OAuthToken oauthToken) {
//		logger.info("oauthToken = ");
//		//logger.info("oauthToken = "+oauthToken);
//		//service.getOAuthToken();
//		
//		OAuthToken token = new OAuthToken();
//		token.setCleintSecret("aaa");
//		
//		return token;
//		
//		//return new ResponseEntity<>(HttpStatus.OK);
//	}
	
	public void test() {
		
		//HttpEntity<T>
		
	}
	
	
//	public void getOauth2() {
//		
//		logger.info("1111111111111111111");
//	}
	
}
