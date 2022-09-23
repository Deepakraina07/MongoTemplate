package com.samco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.samco.model.Employee;
import com.samco.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee add(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@GetMapping("/getEmp")
	public List<Employee> get(){
		return employeeService.getemp();
	}
	
	@GetMapping("/getEmp/{id}")
	public Employee getByEmployee(@PathVariable("id") int id) {
		return employeeService.getbyId(id);
	}
	
	@GetMapping("/name")
	public List<Employee> getName(@RequestParam("name") String name){
		return employeeService.getName(name);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Employee employee) {
		employeeService.delete(employee);
	}
	
}
