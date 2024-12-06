package com.jlcindia.hibernate;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="students2")

public class Student {
	
	@Id 
	 @GeneratedValue(strategy = GenerationType.TABLE, generator = "sid_generator")
	@TableGenerator(name = "sid_generator",table  = "mysid_gen",initialValue = 801,allocationSize = 1)
	 @Column(name = "sid")
	private int sid; 
	 
	 @Column(name = "sname")
	private String sname; 
	 
	 @Column(name = "email")
	private String email; 
	 
	@Column(name = "myphone")
	private int phone; 
	 
	
	
	
	
	

	
	public Student() {}
	
	public Student( String sname, String email, int phone) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		
	}
	
	public Student(int sid, String sname, String email, int phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		
	}
	
	

	
	public int getCid() {
		return sid;
	}

	public void setCid(int cid) {
		this.sid = cid;
	}

	public String getCname() {
		return sname;
	}

	public void setCname(String cname) {
		this.sname = cname;
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
	phone+"\t";
	} 


	
	
	
}
