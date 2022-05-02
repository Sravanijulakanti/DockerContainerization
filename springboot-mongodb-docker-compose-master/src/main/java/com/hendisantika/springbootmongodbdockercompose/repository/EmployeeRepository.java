package com.hendisantika.springbootmongodbdockercompose.repository;

import com.hendisantika.springbootmongodbdockercompose.model.Employee;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<Employee, Long> {

	Optional<Employee> findById(String id);

	void deleteById(String id);
}
