package com.ocbcnisp.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(name="/hello")
	public String sayHi() {
		return "Hi";
	}
}
