package com.codehimalaya.assignmen.services;

import java.util.List;

import com.codehimalaya.assignmen.entities.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();
	public Employee getEmployee(int employeeId);
}
