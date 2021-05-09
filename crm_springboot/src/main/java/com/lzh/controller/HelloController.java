package com.lzh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello,springboot,this hello page";
	}
}