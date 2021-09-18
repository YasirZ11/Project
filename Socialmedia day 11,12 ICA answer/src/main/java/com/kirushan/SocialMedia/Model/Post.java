package com.kirushan.SocialMedia.Model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Post {
	@Id
	private long PostId;
	private String Tittle;
	private String Content;
	private String CreateOn;
	@ManyToOne
	@JoinColumn(name="UserId", referencedColumnName = "UserId")
	private User Owner;
	OneToMany(mapedby "comment")
	public List<Comment>comment;
	
	public Post() {};
	public Post(long postId, String tittle, String content, String createOn, User owner) {
		super();
		PostId = postId;
		Tittle = tittle;
		Content = content;
		CreateOn = createOn;
		
		
		Owner = owner;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public long getPostId() {
		return PostId;
	}
	public void setPostId(long postId) {
		PostId = postId;
	}
	public String getTittle() {
		return Tittle;
	}
	public void setTittle(String tittle) {
		Tittle = tittle;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getCreateOn() {
		return CreateOn;
	}
	public void setCreateOn(String createOn) {
		CreateOn = createOn;
	}
	public User getOwner() {
		return Owner;
	}
	public void setOwner(User owner) {
		Owner = owner;
	}
	
}
