package com.boilerplate.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
