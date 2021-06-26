package com.financial.spend.analyzer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.financial.spend.analyzer.service.TransactionService;

@RestController
public class TransactionSummaryController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping("/customers/{customerId}/transaction")
	public ResponseEntity<Object> getTransactionSummary(
			@PathVariable(value = "customerId", required = true) Long customerId,
			@RequestParam(value = "startDateStr", required = true) String startDateStr,
			@RequestParam(value = "endDateStr", required = true) String endDateStr) {

		return transactionService.getTransactionSummary(customerId, startDateStr, endDateStr);
	}

}
