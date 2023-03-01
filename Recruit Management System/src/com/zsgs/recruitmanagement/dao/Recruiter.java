package com.zsgs.recruitmanagement.dao;

public class Recruiter {
	private String name;
	private String email;
	private int num;
	private String qualify;
	private float cgpa;
	private String title;
	private String description;
	private String experience;

	public Recruiter(String title, String description, String experience) {
		super();
		this.title = title;
		this.description = description;
		this.experience = experience;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getExperience() {
		return experience;
	}

	public Recruiter(String name, String email, int num, String qualify, float cgpa) {
		super();
		this.name = name;
		this.email = email;
		this.num = num;
		this.qualify = qualify;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getNum() {
		return num;
	}

	public String getQualify() {
		return qualify;
	}

	public float getCgpa() {
		return cgpa;
	}
}
