package io.vishal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vishal.model.Employee2;

@RestController
@RequestMapping("/parser")
public class Employee2Controller {
	
	Employee2 employee2Json = new Employee2();
	
	@PostMapping(value = "emp/json", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> fetchEmployeesJson(@RequestBody Employee2 employee2){
		System.out.println("employee2 fetched from controller:: "+employee2);
		
		employee2Json= employee2;
		
		return ResponseEntity.ok("success json");
	}
	
	@GetMapping(value = "/emp/json")
	public ResponseEntity<Employee2> exposeEmployee2Xml(){
		
		return new ResponseEntity<Employee2>(employee2Json, HttpStatus.OK);
	}
	
	@PostMapping(value = "emp/xml")
	public ResponseEntity<String> fetchEmployeesXml(@RequestBody Employee2 employee2){
		System.out.println("employee2 fetched from controller:: "+employee2);
		
		return ResponseEntity.ok("success xml");
	}
	
	
	@PostMapping("/test")
	public ResponseEntity<String> test(){
		System.out.println("test called");
		
		return ResponseEntity.ok("test success");
	}

}
