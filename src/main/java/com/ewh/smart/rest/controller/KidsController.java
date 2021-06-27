package com.ewh.smart.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="kid")
public class KidsController {
	@GetMapping(value="/hello")
	public String helloKid() {
		System.out.println("Hello kid is being invoked/called");
		return "Hello, Kid!";
	}

}
