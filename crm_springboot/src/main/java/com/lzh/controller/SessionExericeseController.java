package com.lzh.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SessionExericeseController {

	@RequestMapping("/sessionPage")
	public String toSessionPage() {
		return "session";
	}
	
	@ResponseBody
	@RequestMapping(value="/createOrGetSession")
	public Map createOrGetSession(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		boolean new1 = session.isNew();
		String id = session.getId();
		Map<String, Object> map = new HashMap<>();
		map.put("sessionID", id);
		map.put("Session 是否存在？", new1);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/setAttribute")
	public String setAttribute(HttpServletRequest request,HttpServletResponse response) throws IOException{
		request.getSession().setAttribute("账号", "lou");
		request.getSession().setAttribute("密码", "123");
		request.getSession().setAttribute("使用者", "陈瑞");
		return "存储session数据成功";
	}
	
	@ResponseBody
	@RequestMapping("/getAttribute")
	public Map getAttribute(HttpServletRequest request,HttpServletResponse response) throws IOException{
		//获取session
		HttpSession session = request.getSession();  
		// 获取session中所有的键值
		Enumeration<?> enumeration = session.getAttributeNames();
		Map<String, Object> map = new HashMap<>();
		// 遍历enumeration
		while (enumeration.hasMoreElements()) {
		  // 获取session的属性名称
		  String name = enumeration.nextElement().toString();
		  // 根据键值取session中的值
		  Object value = session.getAttribute(name);
		  map.put(name, value);
		}
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/getDefaultLife")
	public String getDefaultLife(HttpServletRequest request) {
		int maxInactiveInterval = request.getSession().getMaxInactiveInterval();
		return "Session默认的超时时长是："+maxInactiveInterval+"秒";
	}
	
	@ResponseBody
	@RequestMapping("/setDefaultLife3")
	public String setDefaultLife3(HttpServletRequest request) {
		request.getSession().setMaxInactiveInterval(3);
		return "已经把Session设置为3秒销毁";
	}
	
	@ResponseBody
	@RequestMapping("/setDefaultLifeNow")
	public String setDefaultLifeNow(HttpServletRequest request) {
		request.getSession().invalidate();
		return "Session将立即销毁";
	}
}