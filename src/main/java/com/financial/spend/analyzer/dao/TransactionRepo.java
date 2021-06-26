package com.financial.spend.analyzer.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.financial.spend.analyzer.entity.TransactionEntity;

public interface TransactionRepo extends JpaRepository<TransactionEntity, Long> {

	@Query("select t from TransactionEntity t inner join t.accountEntity acc where acc.customerId=:customerId and transactionDate BETWEEN :startDate AND :endDate")
	List<TransactionEntity> findTransactionByCustomerIdBetweenDates(@Param("customerId") Long customerId,
			@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
