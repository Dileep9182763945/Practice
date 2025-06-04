package com.advintek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {

	@GetMapping("/welcome")
	public String displayMessage() {
		 return "welcome to Hyderabad";
	}
}
