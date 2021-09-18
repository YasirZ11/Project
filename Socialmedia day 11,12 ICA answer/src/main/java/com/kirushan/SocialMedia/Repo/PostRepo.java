package com.kirushan.SocialMedia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirushan.SocialMedia.Model.Post;

public interface PostRepo extends JpaRepository<Post, String> {

}
