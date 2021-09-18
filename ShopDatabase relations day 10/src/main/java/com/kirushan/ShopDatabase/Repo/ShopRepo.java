package com.kirushan.ShopDatabase.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kirushan.ShopDatabase.Model.Shop;


@Repository
public interface ShopRepo extends JpaRepository<Shop, String> {
	
}
