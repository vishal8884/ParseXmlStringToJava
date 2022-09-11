package io.vishal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vishal.model.Employee;
import io.vishal.service.StringToXmlParseService;

@RestController
@RequestMapping("/parser")
public class EmployeeController {
	
	@Autowired
	private StringToXmlParseService stringToXmlParseService;
	
	@PostMapping("/emp")
	public ResponseEntity<String> fetchEmployees(@RequestBody String employee){
		System.out.println("employee fetched from controller:: "+employee);
		
		try {
			Employee emp= stringToXmlParseService.covertStringToXml(employee);
			System.out.println("mapped employee :: "+emp);
		} catch (Exception e) {
			System.out.println("exception occured in controller");
			e.printStackTrace();
			return new ResponseEntity<String>("exception "+e.getMessage(),HttpStatus.BAD_GATEWAY);
		}
		
		return ResponseEntity.ok("success");
	}

}
