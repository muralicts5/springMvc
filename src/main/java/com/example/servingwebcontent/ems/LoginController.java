package com.example.servingwebcontent.ems;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showLogin(){
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String doLogin(){
		return "j_spring_security_check";
	}
	
}