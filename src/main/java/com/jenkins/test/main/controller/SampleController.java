package com.jenkins.test.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SampleController {

	@GetMapping("/status")
	public String getStatus() {
		return "Hello Jenkins Pipeline.";
	}
}
