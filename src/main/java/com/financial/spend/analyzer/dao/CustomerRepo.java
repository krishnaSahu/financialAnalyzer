package com.financial.spend.analyzer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financial.spend.analyzer.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {

}
