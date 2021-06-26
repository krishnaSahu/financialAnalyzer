package com.financial.spend.analyzer.dto;

import java.util.Date;

/**
 * @author Sarang
 *
 */
public class TransactionDTO {

	
	private String transactioNumber;
	private String transactioDescription;
	private Double transactioAmount;
	private String transactioType;
	private Date transactioDate;
	
	
	public String getTransactioNumber() {
		return transactioNumber;
	}
	public void setTransactioNumber(String transactioNumber) {
		this.transactioNumber = transactioNumber;
	}
	public String getTransactioDescription() {
		return transactioDescription;
	}
	public void setTransactioDescription(String transactioDescription) {
		this.transactioDescription = transactioDescription;
	}
	public Double getTransactioAmount() {
		return transactioAmount;
	}
	public void setTransactioAmount(Double transactioAmount) {
		this.transactioAmount = transactioAmount;
	}
	public String getTransactioType() {
		return transactioType;
	}
	public void setTransactioType(String transactioType) {
		this.transactioType = transactioType;
	}
	public Date getTransactioDate() {
		return transactioDate;
	}
	public void setTransactioDate(Date transactioDate) {
		this.transactioDate = transactioDate;
	}
	
	
	@Override
	public String toString() {
		return "TransactionDTO [transactioNumber=" + transactioNumber + ", transactioDescription="
				+ transactioDescription + ", transactioAmount=" + transactioAmount + ", transactioType="
				+ transactioType + ", transactioDate=" + transactioDate + "]";
	}


	
	
}
