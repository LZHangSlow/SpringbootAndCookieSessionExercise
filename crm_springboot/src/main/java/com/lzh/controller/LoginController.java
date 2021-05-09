package com.lzh.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	//跳转到登录页
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//判断登录信息以及cookie自动填充等
	@RequestMapping("/jugLogin")
	public String jugLogin(HttpServletRequest request,HttpServletResponse response) {
		String usernameString = request.getParameter("username");
		String passwordString = request.getParameter("password");
		if(usernameString.equals("lou")&&passwordString.equals("123")) {
			Cookie cookie = new Cookie("username", usernameString);
			cookie.setMaxAge(60*60*24*7);
			response.addCookie(cookie);
			System.out.println("登陆成功");
			return "sucess";
		}else {
			return "errorPage";
		}
	}
}
