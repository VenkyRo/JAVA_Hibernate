package com.jlcindia.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table(name="gcustomers") 
@PrimaryKeyJoinColumn(name="mycid") 

public class GoldCustomer extends Customer {
	@Column(name="supportPhone") 
	private long supportPhone; 
	@Column(name="rpoints") 
	private int rpoints; 
	@Column(name="cashback") 
	private double cashback; 
	@Column(name="earlyAccess") 
	private boolean earlyAccess; 
	public GoldCustomer() {} 
	public GoldCustomer(String cname, String email, long 
	phone, Date dob, long supportPhone, int rpoints, 
	double cashback, 
	boolean earlyAccess) { 
	super(cname, email, phone, dob); 
	this.supportPhone = supportPhone; 
	this.rpoints = rpoints; 
	this.cashback = cashback; 
	this.earlyAccess = earlyAccess; 
	} 
	//Setters and Getters 
	
	@Override 
	public String toString() { 
	return super.toString()+"\t"+supportPhone + "\t" + 
	rpoints + "\t" + cashback + "\t" + earlyAccess; 
	}
	public long getSupportPhone() {
		return supportPhone;
	}
	public void setSupportPhone(long supportPhone) {
		this.supportPhone = supportPhone;
	}
	public int getRpoints() {
		return rpoints;
	}
	public void setRpoints(int rpoints) {
		this.rpoints = rpoints;
	}
	public double getCashback() {
		return cashback;
	}
	public void setCashback(double cashback) {
		this.cashback = cashback;
	}
	public boolean isEarlyAccess() {
		return earlyAccess;
	}
	public void setEarlyAccess(boolean earlyAccess) {
		this.earlyAccess = earlyAccess;
	}

}
