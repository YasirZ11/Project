package com.kirushan.StudentManyToManynew1.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirushan.StudentManyToManynew1.Model.Course;

public interface CourseRepo extends JpaRepository<Course, String>{

}
