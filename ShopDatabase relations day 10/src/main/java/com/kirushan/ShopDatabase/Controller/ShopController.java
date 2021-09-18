package com.kirushan.ShopDatabase.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirushan.ShopDatabase.Model.Shop;
import com.kirushan.ShopDatabase.Repo.ShopRepo;

@RestController
@RequestMapping("/Shop")
public class ShopController {
	@Autowired
	ShopRepo context;
	
	@GetMapping
	public List<Shop> getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{ID}")
	public Shop get(@PathVariable("ID")String id) {
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Shop shop) {
		context.save(shop);
	}
	
	@PutMapping
	public void update(@RequestBody Shop shop) {
		context.save(shop);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
	
}
