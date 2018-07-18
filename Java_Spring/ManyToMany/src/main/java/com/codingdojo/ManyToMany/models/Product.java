package com.codingdojo.ManyToMany.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1,max=255,message="Please provide a product name.")
	private String name;

	@Size(min=1,max=255,message="Please provide a product description.")
	private String description;
	
	@Min(1)	
	private double cost;	
	
    @Column(updatable=false)
    private Date createdAt;

	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name="categories_products",
		joinColumns=@JoinColumn(name="product_id"),
		inverseJoinColumns=@JoinColumn(name="category_id")
	)
	private List<Category> categories;

	public Product() {
	}
	public Product(String name, String description, double cost) {
		this.name = name;
		this.description = description;
		this.cost = cost;
	}
	
	//GETTERS//
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getCost() {
		return cost;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public List<Category> getCategories() {
		return categories;
	}
	
	//SETTERS//
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
}