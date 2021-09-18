package com.kirushan.ShopDatabase.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	private String productId;
	private String productName;
	private int quantity;
	private String quality;
	
	@ManyToOne
	@JoinColumn(name = "shopId", referencedColumnName ="shopId")
	public Shop shop;
	
	
	
	
	public Product() {
		
	}




	public Product(String productId, String productName, int quantity, String quality, Shop shop) {
	
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.quality = quality;
		this.shop = shop;
	}




	public String getProductId() {
		return productId;
	}




	public void setProductId(String productId) {
		this.productId = productId;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public String getQuality() {
		return quality;
	}




	public void setQuality(String quality) {
		this.quality = quality;
	}




	public Shop getShop() {
		return shop;
	}




	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	
	
}
