package com.kirushan.ShopDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kirushan.ShopDatabase.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {

}
