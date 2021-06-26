package com.financial.spend.analyzer.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.financial.spend.analyzer.dao.CustomerRepo;
import com.financial.spend.analyzer.dto.CustomerDto;
import com.financial.spend.analyzer.entity.CustomerEntity;
import com.financial.spend.analyzer.service.CustomerService;
import com.financial.spend.analyzer.utils.CommonResponseUtil;
import com.financial.spend.analyzer.utils.ObjectMapperUtils;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Transactional
	@Override
	public ResponseEntity<Object> saveCustomer(CustomerDto customerDto) {

		CustomerEntity customerEntity = ObjectMapperUtils.map(customerDto, CustomerEntity.class);

		customerEntity = customerRepo.save(customerEntity);

		return CommonResponseUtil.getSuccessResponse("customerId", customerEntity.getCustomerId(), "");
	}

}
