package com.financial.spend.analyzer.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.financial.spend.analyzer.dao.TransactionRepo;
import com.financial.spend.analyzer.entity.TransactionEntity;
import com.financial.spend.analyzer.service.TransactionService;
import com.financial.spend.analyzer.utils.DateUtils;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepo transactionRepo;

	@Override
	public ResponseEntity<Object> getTransactionSummary(Long customerId, String startDateStr, String endDateStr) {

		Date startDate = DateUtils.getDate(startDateStr);
		Date endDate = DateUtils.getDate(endDateStr);

		List<TransactionEntity> transactionList = transactionRepo.findTransactionByCustomerIdBetweenDates(customerId,
				startDate, endDate);

		return null;
	}

}
