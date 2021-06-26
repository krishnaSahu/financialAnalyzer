package com.financial.spend.analyzer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/customer")
	public String getCustomerId() {

		return "1";

	}
}
