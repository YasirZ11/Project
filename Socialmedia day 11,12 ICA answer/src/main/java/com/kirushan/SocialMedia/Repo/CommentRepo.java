package com.kirushan.SocialMedia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirushan.SocialMedia.Model.Comment;


public interface CommentRepo extends JpaRepository<Comment, String> {
}
