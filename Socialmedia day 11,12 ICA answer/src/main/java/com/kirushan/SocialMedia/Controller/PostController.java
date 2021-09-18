package com.kirushan.SocialMedia.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kirushan.SocialMedia.Model.Post;
import com.kirushan.SocialMedia.Repo.PostRepo;

public class PostController {
	@Autowired
	PostRepo contex;
	@GetMapping
	public List<Post> getAll(){
		return contex.findAll();
	}
	@GetMapping("/{PostId}")
	public Optional<Post> get(@PathVariable("PostId") String id) {
		return contex.findById(id);
	}
	@PostMapping
	public void add(@RequestBody Post post) {
		contex.save(post);
	}
	
	@PutMapping
	public void update(@RequestBody Post post) {
		contex.save(post);
	}
	
	public void delete(@PathVariable("postId") String id) {
		contex.deleteById(id);
	}
	
}
