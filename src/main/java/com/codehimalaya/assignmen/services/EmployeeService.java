package com.codehimalaya.assignmen.services;

import java.util.List;

import com.codehimalaya.assignmen.entities.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {
	List<Employee> getEmployees();
	Employee getEmployee(int employeeId);
	ResponseEntity<Object> getEmployeeData();
}
