package com.kirushan.SocialMedia.Model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Comment {
	@Id
	private long CommentId;
	private String Comment;
	private String CommentOn;
	@ManyToOne
	@JoinColumn(name="commentin", referencedColumnName ="PostId")
	private Post CommentIn;
	@ManyToOne
	@JoinColumn(name="commentby", referencedColumnName ="USerId")
	private User CommentBy;
	
	public Comment() {}

	public Comment(long commentId, String comment, String commentOn, Post commentIn, User commentBy) {
		super();
		CommentId = commentId;
		Comment = comment;
		CommentOn = commentOn;
		CommentIn = commentIn;
		CommentBy = commentBy;
	}

	public long getCommentId() {
		return CommentId;
	}

	public void setCommentId(long commentId) {
		CommentId = commentId;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public String getCommentOn() {
		return CommentOn;
	}

	public void setCommentOn(String commentOn) {
		CommentOn = commentOn;
	}

	public Post getCommentIn() {
		return CommentIn;
	}

	public void setCommentIn(Post commentIn) {
		CommentIn = commentIn;
	}

	public User getCommentBy() {
		return CommentBy;
	}

	public void setCommentBy(User commentBy) {
		CommentBy = commentBy;
	};
	
	
}
