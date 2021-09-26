package com.kirushan.manyToMAnyShopApi.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Customer {
	@Id
	private String CustomerId;
	private String CustomerName;
	@ManyToMany
	@JoinTable(name = "CustPro",joinColumns ={@JoinColumn(name="CustomerId",referencedColumnName = "CustomerId")},
	inverseJoinColumns = {@JoinColumn(name="ProductId",referencedColumnName = "ProductId")})
	private List<Product>products=new ArrayList<Product>();
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String customerName, List<Product> products) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		this.products = products;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
