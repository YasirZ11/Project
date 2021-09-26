package com.kirushan.manyToMAnyShopApi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirushan.manyToMAnyShopApi.Model.Product;

public interface ProductRepo extends JpaRepository<Product, String> {

}
