package com.lzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuccessErrorForwardTestTestController {

	@RequestMapping("/success")
	public String success() {
		return "success";
	}
	
	@RequestMapping("/errorPage")
	public String error() {
		return "error";
	}
}
