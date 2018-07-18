package com.codingdojo.LicensesAssignement.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="licenses")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min=2, max=2, message="Please enter a State.")
    private String state;
    
    private Date expiration_date;
    private String number;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    
    private Person person;
    
    public License() {
    }
    
    public License(String state, Date expiration_date, String number, Person person) {
    	this.state = state;
    	this.expiration_date = expiration_date;
    	this.number = number;
    	this.person = person;
	}

    //**GETTERS**//
	public Long getId() {
		return id;
	}
	public Date getExpiration_date() {
		return expiration_date;
	}
	public String getState() {
		return state;
	}
	public String getNumber() {
		return number;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public Person getPerson() {
		return person;
	}

	//**SETTERS**//
	public void setId(Long id) {
		this.id = id;
	}
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public void setPerson(Person person) {
		this.person = person;
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
