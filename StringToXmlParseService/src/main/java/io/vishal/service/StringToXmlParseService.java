package io.vishal.service;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import io.vishal.model.Employee;

@Service
public class StringToXmlParseService {

	public Employee covertStringToXml(String ip) {
		Employee employee = new Employee();
		JAXBContext jaxbContext;
		
		try {
			jaxbContext = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshler = jaxbContext.createUnmarshaller();
			
			StringReader sr = new StringReader(ip);
			
			employee = (Employee)unmarshler.unmarshal(sr);
			
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
		
		return employee;
	}
}
