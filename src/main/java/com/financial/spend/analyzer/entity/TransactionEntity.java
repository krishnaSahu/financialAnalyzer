package com.financial.spend.analyzer.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sarang
 *
 */
@Entity
@Table(name = "transaction")
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_tran_id", columnDefinition = "serial")
	private Long transactionId;

	@Column(name = "c_tran_num", nullable = false)
	private String transactioNumber;

	@Column(name = "c_acco_acctid", nullable = false)
	private String accountId;

	@Column(name = "d_tran_date", nullable = false)
	private Date transactionDate;

	@Column(name = "e_tran_amount", nullable = false)
	private Double transactionAmount;

	@Column(name = "a_tran_type", nullable = false)
	private String transactionType;

	@Column(name = "a_tran_description", nullable = true)
	private String transactionDescription;

	@Column(name = "a_tran_status", nullable = false)
	private String transactionStatus;

	@Column(name = "a_tran_currbal", nullable = false)
	private Double currBalance;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactioNumber() {
		return transactioNumber;
	}

	public void setTransactioNumber(String transactioNumber) {
		this.transactioNumber = transactioNumber;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public Double getCurrBalance() {
		return currBalance;
	}

	public void setCurrBalance(Double currBalance) {
		this.currBalance = currBalance;
	}

}
