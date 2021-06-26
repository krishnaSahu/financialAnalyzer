package com.financial.spend.analyzer.service;

import org.springframework.http.ResponseEntity;

public interface TransactionService {

	ResponseEntity<Object> getTransactionSummary(Long customerId, String startDateStr, String endDateStr);

}
