package com.lzh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterTestController {

	@GetMapping("/car/{id}/owner/{username}")
	public Map<String,Object> getCar(@PathVariable("id") Integer id,@PathVariable("username")String name,
			@PathVariable Map<String, String> pv,
			@RequestHeader("Host") String host,
			@RequestHeader("User-Agent") String userAgent,
			@RequestHeader Map<String, String> headers,
			@RequestParam("age") Integer age,
			@RequestParam("inters") List<String> inters,
			@CookieValue("Idea-7cca2a9e") String cookie,
			@CookieValue("Idea-7cca2a9e") Cookie Idea7cca2a9e){
		HashMap<String,Object> map = new HashMap<>();
		map.put("id", id);
		map.put("name", name);
		map.put("pv",pv);
		map.put("host", host);
		map.put("userAgent", userAgent);
		map.put("headers", headers);
		map.put("age", age);
		map.put("inters", inters);
		map.put("cookie",cookie);
		map.put("Idea7cca2a9e", Idea7cca2a9e);
		System.out.println(Idea7cca2a9e.getName()+"----"+Idea7cca2a9e.getValue());
		return map;
	}
	
	@PostMapping("/save")
	public Map postMethod(@RequestBody String content) {
		Map<String, Object> map = new HashMap<>();
		map.put("content", content);
		return map;
	}
	
}
