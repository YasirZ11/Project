package com.kirushan.manyToMAnyShopApi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirushan.manyToMAnyShopApi.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String>{

}
