package com.kirushan.ShopDatabase.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirushan.ShopDatabase.Model.Customer;
import com.kirushan.ShopDatabase.Repo.CustomerRepo;


@RestController
@RequestMapping("/Customer")

public class CustomerController {
	@Autowired
	CustomerRepo context;
	
	@GetMapping
	public List<Customer> getAll(){
		return context.findAll();
	}
	@GetMapping("/{ID}")
	public Customer get(@PathVariable("ID") String id) {
		return context.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Customer customer) {
		context.save(customer);
	}
	
	@PutMapping
	public void update(@RequestBody Customer customer) {
		context.save(customer);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
	
	
}
