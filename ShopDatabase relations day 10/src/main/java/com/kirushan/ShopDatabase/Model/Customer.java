package com.kirushan.ShopDatabase.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	private String customerId;
	private String customerName;
	private String address;
	private int billNo;
	@ManyToOne
	@JoinColumn(name="shopId",referencedColumnName ="shopId" )
	public Shop shop1;
	
	
	

	public Customer() {
	
	}




	public Customer(String customerId, String customerName, String address, int billNo, Shop shop1) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.billNo = billNo;
		this.shop1 = shop1;
	}




	public String getCustomerId() {
		return customerId;
	}




	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}




	public String getCustomerName() {
		return customerName;
	}




	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public int getBillNo() {
		return billNo;
	}




	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}




	public Shop getShop1() {
		return shop1;
	}




	public void setShop1(Shop shop1) {
		this.shop1 = shop1;
	}
	
}
