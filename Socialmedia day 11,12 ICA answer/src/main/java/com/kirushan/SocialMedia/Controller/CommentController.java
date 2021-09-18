package com.kirushan.SocialMedia.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kirushan.SocialMedia.Model.Comment;
import com.kirushan.SocialMedia.Repo.CommentRepo;

public class CommentController {
	@Autowired
	CommentRepo contex;
	@GetMapping
	public List<Comment>getAll(){
		return contex.findAll();
	}
	@GetMapping("/{UserId}")
	public Optional<Comment> get(@PathVariable("CommentID") String id) {
		return contex.findById(id);
	}
	@PostMapping
	public void add(@RequestBody Comment comment) {
		contex.save(comment);
	}
	
	@PutMapping
	public void update(@RequestBody Comment comment) {
		contex.save(comment);
	}
	
	public void delete(@PathVariable("CommentId") String id) {
		contex.deleteById(id);
	}
}
