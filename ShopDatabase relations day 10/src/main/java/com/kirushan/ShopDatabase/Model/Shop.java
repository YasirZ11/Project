package com.kirushan.ShopDatabase.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Shop {
	@Id
	private String shopId;
	private String shopName;
	private String branchNo;
	
	@OneToMany(mappedBy = "shop1")
	public List<Customer> customers;
	
	
	@OneToMany(mappedBy = "shop")
	public List<Product> products;
	
	
	
	
	public Shop() {
		
	}




	public Shop(String shopId, String shopName, String branchNo, List<Customer> customers, List<Product> products) {

		this.shopId = shopId;
		this.shopName = shopName;
		this.branchNo = branchNo;
		this.customers = customers;
		this.products = products;
	}




	public String getShopId() {
		return shopId;
	}




	public void setShopId(String shopId) {
		this.shopId = shopId;
	}




	public String getShopName() {
		return shopName;
	}




	public void setShopName(String shopName) {
		this.shopName = shopName;
	}




	public String getBranchNo() {
		return branchNo;
	}




	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}




	public List<Customer> getCustomers() {
		return customers;
	}




	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}




	public List<Product> getProducts() {
		return products;
	}




	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
