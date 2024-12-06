package com.jlcindia.hibernate;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="Books")

public  class Book {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="bookId") 
	private int bookId; 
	@Column(name="bookName") 
	private String bookName; 
	@Column(name="cost") 
	private double cost; 
	@Column(name="edition") 
	private int edition; 
	@Column(name="yop") 
	private int yop; 
	@Column(name="status") 
	private String status; 
	@ManyToMany 
	@JoinTable( 
	name="authors_books", 
	joinColumns =@JoinColumn(name="myBookId",referencedColumnName = "bookId"), 
	inverseJoinColumns =@JoinColumn(name="myAuthorId",referencedColumnName = "authorId") 
	) 
	private Set<Author> myauthors; 
	@OneToMany(mappedBy = "mybook") 
	private Set<OrderItem> myOrderItems; 
	public Book() {} 
	public Book(String bookName, double cost, int edition, 
	int yop, String status) { 
	this.bookName = bookName; 
	this.cost = cost; this.edition = edition; 
	 this.yop = yop; this.status = status; 
	} 
	
	

	public Book(int bookId, String bookName, double cost, int edition, int yop) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.cost = cost;
		this.edition = edition;
		this.yop = yop;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<Author> getMyauthors() {
		return myauthors;
	}
	public void setMyauthors(Set<Author> myauthors) {
		this.myauthors = myauthors;
	}
	public Set<OrderItem> getMyOrderItems() {
		return myOrderItems;
	}
	public void setMyOrderItems(Set<OrderItem> myOrderItems) {
		this.myOrderItems = myOrderItems;
	}
	@Override 
	public String toString() { 
	return bookId + "\t" + bookName + "\t" + cost + "\t" + 
	edition + "\t" + yop+"\t"+status ; 
	} 
	
	
	
}
