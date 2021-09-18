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

import com.kirushan.ShopDatabase.Model.Product;
import com.kirushan.ShopDatabase.Repo.ProductRepo;





@RestController
@RequestMapping("/Product")

public class ProductController {
	@Autowired
	ProductRepo context;
	@GetMapping
	public List<Product>getAll(){
		return context.findAll();
	}
	@GetMapping("/{ID}")
	public Product get(@PathVariable("ID")String id) {
		return context.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Product product) {
		context.save(product);
	}
	
	@PutMapping
	public void update(@RequestBody Product product) {
		context.save(product);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
}
