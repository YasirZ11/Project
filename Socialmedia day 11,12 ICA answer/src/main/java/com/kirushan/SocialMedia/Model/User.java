package com.kirushan.SocialMedia.Model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class User {
	@Id
	private String UserId;
	private String Email;
	private String FirstName;
	private String LastName;
	private int Age;
	@OneToMany(mappedBy = "user")
	public List<Post>post;
	@OneToMany(mappedBy = "comment")
	public List<Comment>comment;
	
	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	public User() {}

	public User(String userId, String email, String firstName, String lastName, int age) {
		super();
		UserId = userId;
		Email = email;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	};
	
	
}
