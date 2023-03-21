package com.parthpandya.theatremgmt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "transaction")
@Entity
public class Transaction {

	@Id
	@GeneratedValue
    @Column(name = "transaction_id")
	long id;

	String clientIp;
	String processorTransactionID;
	boolean isRefunded;
	String userEmail;
	double amount;
	String paymentType;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id")
	Cinema cinema;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getProcessorTransactionID() {
		return processorTransactionID;
	}
	public void setProcessorTransactionID(String processorTransactionID) {
		this.processorTransactionID = processorTransactionID;
	}
	public boolean isRefunded() {
		return isRefunded;
	}
	public void setRefunded(boolean isRefunded) {
		this.isRefunded = isRefunded;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	
}
