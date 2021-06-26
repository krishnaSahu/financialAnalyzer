package com.financial.spend.analyzer.service;

import org.springframework.http.ResponseEntity;

import com.financial.spend.analyzer.dto.CustomerDto;

public interface CustomerService {

	ResponseEntity<Object> saveCustomer(CustomerDto customerDto);

}
