package com.Revision1.Revision1.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subjectid;
	private String name;
	private int cost;
	private String author;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subjectid, String name, int cost, String author) {
		super();
		this.subjectid = subjectid;
		this.name = name;
		this.cost = cost;
		this.author = author;
	}
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", name=" + name + ", cost=" + cost + ", author=" + author + "]";
	}
	
}
