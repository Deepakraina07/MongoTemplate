package com.samco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.model.Employee;
import com.samco.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getemp(){
		return employeeRepository.find();
	}
	
	public List<Employee> getName(String name){
		return employeeRepository.findByName(name);
	}
	
	public Employee getbyId(int id) {
		return employeeRepository.getByEmployee(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void delete(Employee employee) {
		 employeeRepository.deleteEmployee(employee);
	}
}
