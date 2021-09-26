package com.kirushan.StudentManyToManynew1.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Course {
	@Id
	private String CourseId;
	private String Name;
	private int Duration;
	@ManyToMany
	@JoinTable(name = "stucourse",joinColumns = {@JoinColumn(name="StudentId",referencedColumnName = "StudentId")},
	inverseJoinColumns = {@JoinColumn(name="CourseId",referencedColumnName = "CourseId")})
	private List<Student>studentes=new ArrayList<Student>();
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String courseId, String name, int duration, List<Student> studentes) {
		super();
		CourseId = courseId;
		Name = name;
		Duration = duration;
		this.studentes = studentes;
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public List<Student> getStudentes() {
		return studentes;
	}

	public void setStudentes(List<Student> studentes) {
		this.studentes = studentes;
	}
	
}
