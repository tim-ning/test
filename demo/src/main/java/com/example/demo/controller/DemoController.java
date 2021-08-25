package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/test")
	public String readTest() {
		return "<h1>Hello world!!</h1>";
	}
}
