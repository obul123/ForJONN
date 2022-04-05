package com.Revision1.Revision1.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Teacher1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teacherid;
	private String name;
	private String place;
	private int phone;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teacher_id",referencedColumnName = "teacherid")
	private List<Subject> subjects;

	public Teacher1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher1(int teacherid, String name, String place, int phone, List<Subject> subjects) {
		super();
		this.teacherid = teacherid;
		this.name = name;
		this.place = place;
		this.phone = phone;
		this.subjects = subjects;
	}

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Teacher1 [teacherid=" + teacherid + ", name=" + name + ", place=" + place + ", phone=" + phone
				+ ", subjects=" + subjects + "]";
	}
	
	
	
}
