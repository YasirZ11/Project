package com.kirushan.SocialMedia.Controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirushan.SocialMedia.Model.User;
import com.kirushan.SocialMedia.Repo.UserRepo;

@RestController
@RequestMapping("/User")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class UserController {

	@Autowired
	UserRepo contex;
	@GetMapping
	public List<User>getAll(){
		return contex.findAll();
	}
	@GetMapping("/{UserId}")
	public Optional<User> get(@PathVariable("UserId") String id) {
		return contex.findById(id);
	}
	@PostMapping
	public void add(@RequestBody User user) {
		contex.save(user);
	}
	
	@PutMapping
	public void update(@RequestBody User user) {
		contex.save(user);
	}
	
	public void delete(@PathVariable("userid") String id) {
		contex.deleteById(id);
	}
	
}
