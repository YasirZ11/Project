package com.kirushan.StudentManyToManynew1.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	private long StidentId;
	private String Name;
	private String Institude;
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "Course")
	private List<Course>courses=new ArrayList<Course>();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long stidentId, String name, String institude, List<Course> courses) {
		super();
		StidentId = stidentId;
		Name = name;
		Institude = institude;
		this.courses = courses;
	}

	public long getStidentId() {
		return StidentId;
	}

	public void setStidentId(long stidentId) {
		StidentId = stidentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getInstitude() {
		return Institude;
	}

	public void setInstitude(String institude) {
		Institude = institude;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
