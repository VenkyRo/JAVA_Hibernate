package com.jlcindia.hibernate;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="mystudents")

public class Student {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name="sid") 
	private int sid; 
	 
	 @Column(name="sname") 
	private String sname; 
	 
	 @Column(name="email") 
	private String email; 
	 
	@Column(name="phone") 
	private int phone; 
	 
	@ManyToMany
	@JoinTable(name = "Stu_Cou", joinColumns = @JoinColumn(name = "mysid", referencedColumnName = "sid")
	,inverseJoinColumns =  @JoinColumn(name = "mycid",referencedColumnName = "couId")
	)
	private Set<Courses> courses;
	
	

	
	public Student() {}




	public Student(int sid, String sname, String email, int phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}




	public Student(String sname, String email, int phone) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	
	




	public Student(String sname, String email, int phone, Set<Courses> courses) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.courses = courses;
	}




	public Student(int sid, String sname, String email, int phone, Set<Courses> courses) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.courses = courses;
	}




	




	public Set<Courses> getCourses() {
		return courses;
	}




	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}




	public int getSid() {
		return sid;
	}




	public void setSid(int sid) {
		this.sid = sid;
	}




	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getPhone() {
		return phone;
	}




	public void setPhone(int phone) {
		this.phone = phone;
	}




	@Override 
	public String toString() { 
	return sid + "\t" + sname + "\t" + email + "\t" + 
	phone ; 
	} 
	
	
	
	
	
	

	
	
	
}
