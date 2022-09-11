package io.vishal.model;

import javax.xml.bind.annotation.XmlElement;

public class Employee2 {

    private long id;
	
	private String name;
	
	private String age;
	
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee2(long id, String name, String age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public Employee2() {
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
}
