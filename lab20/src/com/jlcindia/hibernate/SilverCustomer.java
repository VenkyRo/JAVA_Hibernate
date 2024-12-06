package com.jlcindia.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table(name="scustomers") 
@PrimaryKeyJoinColumn(name="mycid") 
public class SilverCustomer extends Customer{
	@Column(name="supportEmail") 
	private String supportEmail; 
	@Column(name="discounts") 
	private double discounts; 
	@Column(name="shippingFee") 
	private double shippingFee; 
	@Column(name="handlingCharges") 
	private double handlingCharges; 
	public SilverCustomer() {} 
	public SilverCustomer(String cname, String email, long 
	phone, Date dob, String supportEmail, double discounts, 
	double shippingFee, double handlingCharges) { 
	super(cname, email, phone, dob); 
	this.supportEmail = supportEmail; 
	this.discounts = discounts; 
	this.shippingFee = shippingFee; 
	this.handlingCharges = handlingCharges; 
	} 
	//Setters and Getters 
	
	@Override 
	public String toString() { 
	return super.toString()+"\t"+supportEmail + "\t" + 
	discounts + "\t" + shippingFee + "\t" + handlingCharges; 
	}
	public String getSupportEmail() {
		return supportEmail;
	}
	public void setSupportEmail(String supportEmail) {
		this.supportEmail = supportEmail;
	}
	public double getDiscounts() {
		return discounts;
	}
	public void setDiscounts(double discounts) {
		this.discounts = discounts;
	}
	public double getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(double shippingFee) {
		this.shippingFee = shippingFee;
	}
	public double getHandlingCharges() {
		return handlingCharges;
	}
	public void setHandlingCharges(double handlingCharges) {
		this.handlingCharges = handlingCharges;
	}
}
