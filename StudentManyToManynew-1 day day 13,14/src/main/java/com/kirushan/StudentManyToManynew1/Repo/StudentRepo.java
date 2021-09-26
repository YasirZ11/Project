package com.kirushan.StudentManyToManynew1.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirushan.StudentManyToManynew1.Model.Student;

public interface StudentRepo extends JpaRepository<Student,String> {

}
