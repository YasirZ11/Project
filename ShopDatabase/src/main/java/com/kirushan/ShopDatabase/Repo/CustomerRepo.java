package com.kirushan.ShopDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kirushan.ShopDatabase.Model.Customer;



@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {
	
	
}
