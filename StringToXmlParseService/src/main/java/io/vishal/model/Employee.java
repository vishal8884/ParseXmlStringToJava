package io.vishal.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "Employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	
	@XmlElement(name = "id")
	private long id;
	
	@XmlElement(name = "name")
	private String name;
	
	@XmlElement(name = "age")
	private String age;
	
	@XmlElement(name = "email")
	private String email;

	

	
}
