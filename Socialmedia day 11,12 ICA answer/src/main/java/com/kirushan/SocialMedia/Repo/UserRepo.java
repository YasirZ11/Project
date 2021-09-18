package com.kirushan.SocialMedia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirushan.SocialMedia.Model.User;

public interface UserRepo extends JpaRepository<User, String> {

}
