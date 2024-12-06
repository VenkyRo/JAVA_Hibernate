package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity 
@Table(name="orderItems") 
public class OrderItem {
	
	@Id 
	@GeneratedValue(strategy = 
	GenerationType.IDENTITY) 
	@Column(name="orderItemId") 
	private int orderItemId; 
	@Column(name="qty") 
	private int qty; 
	@Column(name="cost") 
	private double cost; 
	@Column(name="status") 
	private String status; 
	@ManyToOne 
	@JoinColumn(name="myOrderId",referencedColumnName = "orderId") 
	private Order order; 
	@ManyToOne 
	@JoinColumn(name="myBookId",referencedColumnName = "bookId") 
	private Book mybook; 
	public OrderItem() {} 
	public OrderItem(int qty, double cost, String status) { 
	this.qty = qty; this.cost = cost; 
	this.status = status; 
	} 
	public OrderItem(int qty, double cost, String status, 
	Book mybook) { 
	this.qty = qty; 
	this.cost = cost; 
	this.status = status; 
	this.mybook = mybook; 
	}
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Book getMybook() {
		return mybook;
	}
	public void setMybook(Book mybook) {
		this.mybook = mybook;
	}
	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", qty=" + qty + ", cost=" + cost + ", status=" + status
				+ ", order=" + order + ", mybook=" + mybook + "]";
	} 
	
	


}
