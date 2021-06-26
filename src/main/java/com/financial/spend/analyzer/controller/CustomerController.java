package com.financial.spend.analyzer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.financial.spend.analyzer.dto.CustomerDto;

@RestController
public class CustomerController {

	@GetMapping("/customer")
	public String getCustomerId(@RequestBody CustomerDto customerDto) {

		return "1";

	}
}
