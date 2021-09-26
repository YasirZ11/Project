package com.kirushan.manyToMAnyShopApi.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Product {
	@Id
	private String ProductId;
	private String ProductName;
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "products")
	private List<Customer>customers=new ArrayList<Customer>();
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, List<Customer> customers) {
		super();
		ProductId = productId;
		ProductName = productName;
		this.customers = customers;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}
