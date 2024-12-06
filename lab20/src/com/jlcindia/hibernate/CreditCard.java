package com.jlcindia.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CreditCard")
public class CreditCard {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id") 
	private int id; 
	@Column(name="cardNumber") 
	private long cardNumber; 
	@Column(name="cardType") 
	private String cardType; 
	@Column(name="expDate") 
	private Date expDate; 
	@Column(name="cvv") 
	private int cvv; 
	@Column(name="status") 
	private String status; 

	@ManyToOne 
	@JoinColumn(name="mycid",referencedColumnName = "cid") 
	private Customer customer; 
	public CreditCard() {} 
	public CreditCard(long cardNumber, String cardType, 
	Date expDate, int cvv, String status) { 
	this.cardNumber = cardNumber; 
	this.cardType = cardType; this.expDate = expDate; 
	this.cvv = cvv; this.status = status; 
	} 
	//Setters and Getters 
	
	@Override 
	public String toString() { 
	return cardNumber + "\t" + cardType + "\t" + expDate + 
	"\t" + cvv + "\t" + status ; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	} 


}
