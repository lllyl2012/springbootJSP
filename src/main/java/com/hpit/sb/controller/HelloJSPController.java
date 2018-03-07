package com.hpit.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloJSPController {
	@RequestMapping("/index")
	public String hello(ModelMap map){
		map.put("message", "this data is from the backing server");
		return "index";
	}
}
