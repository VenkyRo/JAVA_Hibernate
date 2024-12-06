package com.jlcindia.hibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;



@Entity 
@Table(name = "mystudents") 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name = "stuType",length = 5) 
@DiscriminatorValue("STU") 

public class Student {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int mysid;
	    private String sname;
	    private String email;
	    private int phone;

	    public Student() {}

	    public Student(String sname, String email, int phone) {
	        this.sname = sname;
	        this.email = email;
	        this.phone = phone;
	    }

		public Student(int mysid, String sname, String email, int phone) {
			super();
			this.mysid = mysid;
			this.sname = sname;
			this.email = email;
			this.phone = phone;
		}

		public int getMysid() {
			return mysid;
		}

		public void setMysid(int mysid) {
			this.mysid = mysid;
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
			return "Student [mysid=" + mysid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + "]";
		}

	    // Getters and Setters
	    

	

	
	

}
