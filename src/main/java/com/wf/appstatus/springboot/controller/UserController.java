package com.wf.appstatus.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping
	public String hello() {
		// return "Hello, World!";
		// return "redirect:/applicationGroup/";
		return "app_status_index";
	}
}
