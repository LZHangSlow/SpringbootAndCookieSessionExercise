package com.lzh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {

	@GetMapping("/goto")
	public String goToPage(HttpServletRequest request) {
		request.setAttribute("msg", "成功了。。。。。");
		request.setAttribute("code", 200);
		return "forward:/successtest";
	}
	
	  @ResponseBody
	  @GetMapping("/successtest") 
	  public Map success(@RequestAttribute("msg") String msg,
			  			 @RequestAttribute("code") Integer code, HttpServletRequest request) { 
		  Object attribute = request.getAttribute("msg"); 
		  Map<String, Object> map = new HashMap<>(); 
		  map.put("Request_msg", attribute); 
		  map.put("Annotation_msg",msg); 
		  return map; 
	}
	 
}