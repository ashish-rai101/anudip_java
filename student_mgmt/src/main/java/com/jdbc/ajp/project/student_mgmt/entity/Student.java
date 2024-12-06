package com.jdbc.ajp.project.student_mgmt.entity;

public class Student {
	private int id;
	private String name;
	private int age;
	private String contact;
	private String course;
	private String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, int age, String contact, String course, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.course = course;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", contact=" + contact + ", course=" + course
				+ ", email=" + email + "]";
	}
	

}
