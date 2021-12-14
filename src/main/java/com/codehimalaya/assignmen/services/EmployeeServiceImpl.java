package com.codehimalaya.assignmen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehimalaya.assignmen.dao.EmployeeDao;
import com.codehimalaya.assignmen.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployees() {
//		employeeDao.saveAll(Arrays.asList(
//				new Employee(3, "Wilson"),
//				new Employee(4,"Manoj")
//      )); 
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.getById(employeeId);
	}
}
