package com.jlcindia.hibernate;

import javax.persistence.*;
import javax.persistence.Table;

@Entity 
@Table(name="shippingaddress") 

public class ShippingAddress {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="addId") 
	private int addId; 
	@Column(name="street") 
	private String street; 
	@Column(name="city") 
	private String city; 
	@Column(name="state") 
	private String state; 
	@Column(name="pin") 
	private int pin; 
	@OneToOne(mappedBy = "myaddress") 
	private Order order; 
	public ShippingAddress() {} 
	public ShippingAddress(String street, String city, String 
	state, int pin) { 
	super(); 
	this.street = street; 
	this.city = city; 
	this.state = state; 
	this.pin = pin; 
	} 
	//Setters and Getters 
	
	@Override 
	public String toString() { 
	return addId + "\t" + street + "\t" + city + "\t" + state + 
	"\t" + pin; 
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	} 

}
