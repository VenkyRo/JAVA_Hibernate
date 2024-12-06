package com.jlcindia.hibernate;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="mycourses")
public class Courses {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name="couId") 
	private int couId; 
	 
	 @Column(name="couname") 
	private String couname; 
	 
	 @Column(name="trainer") 
	private String trainer; 
	 
	@Column(name="price") 
	private double price; 
	
	
	@ManyToMany(mappedBy = "courses")
	private Set<Student> students;
	
	
	
	
	 
	

	public Courses() {
		
	}



	public Courses(int couId, String couname, String trainer, double price) {
		super();
		this.couId = couId;
		this.couname = couname;
		this.trainer = trainer;
		this.price = price; 
	}



	public Courses(String couname, String trainer, double price) {
		super();
		this.couname = couname;
		this.trainer = trainer;
		this.price = price;
	}
	
	



	



	public Courses(String couname, String trainer, double price, Set<Student> students) {
		super();
		this.couname = couname;
		this.trainer = trainer;
		this.price = price;
		this.students = students;
	}



	public Courses(int couId, String couname, String trainer, double price, Set<Student> students) {
		super();
		this.couId = couId;
		this.couname = couname;
		this.trainer = trainer;
		this.price = price;
		this.students = students;
	}



	public int getCouId() {
		return couId;
	}



	public void setCouId(int couId) {
		this.couId = couId;
	}



	public String getCouname() {
		return couname;
	}



	public void setCouname(String couname) {
		this.couname = couname;
	}



	public String getTrainer() {
		return trainer;
	}



	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Set<Student> getStudents() {
		return students;
	}



	public void setStudents(Set<Student> students) {
		this.students = students;
	}



	@Override 
	public String toString() { 
	return couId + "\t" + couname + "\t" + price + "\t" + 
	trainer ; 
	} 


	
	
	

	
	
	
	
	
	
}
