package com.samco.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.samco.model.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public Employee save(Employee employee) {
		return mongoTemplate.save(employee);
	}
	
	public List<Employee> find(){
		return mongoTemplate.findAll(Employee.class);
	}
	
	public List<Employee> findByName(String name){
		Query query = new Query(Criteria.where("name").regex("^"+name));
		return mongoTemplate.find(query, Employee.class);
	}
	
	public Employee getByEmployee(int id) {
		return mongoTemplate.findById(id, Employee.class);
	}
	
	public Employee update(Employee employee) {
		return mongoTemplate.save(employee);
	}
	
	public Long deleteEmployee(Employee employee) {
		return mongoTemplate.remove(employee).getDeletedCount();
	}
}
