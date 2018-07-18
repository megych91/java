package com.codingdojo.LicensesAssignement.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String fname;
	    private String lname;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	    private License license;
	    
	    public Person() {
	    }
	    
	    public Person(String fname, String lname) {
			this.fname = fname;
			this.lname = lname;
		}
	    
	    //**GETTERS**//

		public Long getId() {
			return id;
		}
		public String getFname() {
			return fname;
		}
	
		public String getLname() {
			return lname;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public License getLicense() {
			return license;
		}

		//**SETTERS**//
		
		public void setId(Long id) {
			this.id = id;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public void setLicense(License license) {
			this.license = license;
		}

		@PrePersist
		protected void onCreate() {
			this.createdAt = new Date();
		}
		
		@PreUpdate
		protected void onUpdate() {
			this.updatedAt = new Date();
		}
		
		
}
