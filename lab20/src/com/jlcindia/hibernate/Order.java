package com.jlcindia.hibernate;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="orders") 
public class Order {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="orderId") 
	private int orderId; 
	@Column(name="orderDate") 
	private Date orderDate; 
	@Column(name="totalQty") 
	private int totalQty; 
	@Column(name="totalCost") 
	private double totalCost; 
	@Column(name="deliveryDate") 
	private Date deliveryDate; 
	@Column(name="status") 
	private String status; 
	@ManyToOne 
	@JoinColumn(name="mycid") 
	private Customer customer; 
	@OneToOne 
	@JoinColumn(name="myaddId") 
	private ShippingAddress myaddress; 
	@OneToMany(mappedBy = "order") 
	private Set<OrderItem> myOrderItems; 
	public Order() {} 
	public Order(Date orderDate, int totalQty, double 
	totalCost, Date deliveryDate, String status) { 
	this.orderDate = orderDate; 
	this.totalQty = totalQty; 
	this.totalCost = totalCost; 
	this.deliveryDate = deliveryDate; 
	this.status = status; 
	} 
	
	//Setters and Getters 
	
	@Override 
	public String toString() { 
	return orderId + "\t" + orderDate + "\t" + totalQty + "\t" 
	+ totalCost + "\t" + deliveryDate+"\t"+status ; 
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
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
	public ShippingAddress getMyaddress() {
		return myaddress;
	}
	public void setMyaddress(ShippingAddress myaddress) {
		this.myaddress = myaddress;
	}
	public Set<OrderItem> getMyOrderItems() {
		return myOrderItems;
	}
	public void setMyOrderItems(Set<OrderItem> myOrderItems) {
		this.myOrderItems = myOrderItems;
	} 

}
