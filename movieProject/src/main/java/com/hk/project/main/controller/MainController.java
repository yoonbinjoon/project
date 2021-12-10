package com.hk.project.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value="/movie/main", method={RequestMethod.GET , RequestMethod.POST})
	public String header() {
		return "main";
	}
	
}
