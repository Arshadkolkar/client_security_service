package com.client.securityservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/hi")
	public String hello() {
		return "Hello";
	}

}
