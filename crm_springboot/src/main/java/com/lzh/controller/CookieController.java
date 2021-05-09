package com.lzh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieController {

	@RequestMapping(value = "/setCookies",method = RequestMethod.GET)
    public  String setCookies(HttpServletResponse response){
        //HttpServerletRequest 装请求信息类
        //HttpServerletRespionse 装相应信息的类
        Cookie cookie=new Cookie("sessionId","CookieTestInfo");
        Cookie cookie2 = new Cookie("car", "BMW");
        Cookie cookie3 = new Cookie("name", "levi");
        response.addCookie(cookie);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        return "添加cookies信息成功";
    }
	
	@RequestMapping(value = "/getCookies",method = RequestMethod.GET)
	public  Map getCookies(HttpServletRequest request){
	    //HttpServletRequest 装请求信息类
	    //HttpServletRespionse 装相应信息的类
	 //   Cookie cookie=new Cookie("sessionId","CookieTestInfo");
	    Cookie[] cookies =  request.getCookies();
	    Map<String, Object> map = new HashMap<>();
	    if(cookies != null){
	        for(Cookie cookie : cookies){
	        	String name = cookie.getName();
	        	String value = cookie.getValue();
	        	map.put(name, value);
	        }
	    }
	 
	   return  map;
	   
	   }
	
	
	
}
