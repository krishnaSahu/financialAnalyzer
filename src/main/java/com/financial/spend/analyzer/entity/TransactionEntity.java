package com.financial.spend.analyzer.entity;

import java.util.Date;

/**
 * @author Sarang
 *
 */
public class TransactionEntity {

	private Long transactionId;
	private String transactioNumber;
	private String accountId;
	private Date transactioDate;
	private Double transactioAmount;
	private String transactioType;
	private String transactioDescription;
	private String transactionStatus;
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
