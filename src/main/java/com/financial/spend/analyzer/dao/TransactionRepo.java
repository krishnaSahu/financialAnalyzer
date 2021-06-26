package com.financial.spend.analyzer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financial.spend.analyzer.entity.TransactionEntity;

public interface TransactionRepo extends JpaRepository<TransactionEntity, Long> {

}
