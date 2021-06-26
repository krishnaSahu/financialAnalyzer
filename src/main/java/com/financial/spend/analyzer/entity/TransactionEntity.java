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
	private Date transactioDate;

	@Column(name = "e_tran_amount", nullable = false)
	private Double transactioAmount;

	@Column(name = "a_tran_type", nullable = false)
	private String transactioType;

	@Column(name = "a_tran_description", nullable = true)
	private String transactioDescription;

	@Column(name = "a_tran_status", nullable = false)
	private String transactionStatus;

	@Column(name = "a_tran_currbal", nullable = false)
	private Double currBalance;

	/**
	 * @return transactionId
	 */
	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return transactionNumber
	 */
	public String getTransactioNumber() {
		return transactioNumber;
	}

	public void setTransactioNumber(String transactioNumber) {
		this.transactioNumber = transactioNumber;
	}

	/**
	 * @return accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return transactionDate
	 */
	public Date getTransactioDate() {
		return transactioDate;
	}

	public void setTransactioDate(Date transactioDate) {
		this.transactioDate = transactioDate;
	}

	/**
	 * @return transactionAmout
	 */
	public Double getTransactioAmount() {
		return transactioAmount;
	}

	public void setTransactioAmount(Double transactioAmount) {
		this.transactioAmount = transactioAmount;
	}

	/**
	 * @return transactionType
	 */

	public String getTransactioType() {
		return transactioType;
	}

	public void setTransactioType(String transactioType) {
		this.transactioType = transactioType;
	}

	/**
	 * @return transactionDescription
	 */
	public String getTransactioDescription() {
		return transactioDescription;
	}

	public void setTransactioDescription(String transactioDescription) {
		this.transactioDescription = transactioDescription;
	}

	/**
	 * @return transactionStatus
	 */

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	/**
	 * @return current Bal
	 */

	public Double getCurrBalance() {
		return currBalance;
	}

	public void setCurrBalance(Double currBalance) {
		this.currBalance = currBalance;
	}

}
