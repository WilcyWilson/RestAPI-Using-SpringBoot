package com.codehimalaya.assignmen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehimalaya.assignmen.dao.DepartmentDao;
import com.codehimalaya.assignmen.dao.EmployeeDao;
import com.codehimalaya.assignmen.entities.Department;
import com.codehimalaya.assignmen.entities.Employee;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Department addDepartment(Department department) {
		return departmentDao.save(department);
	}
	@Override
	public Employee assignEmployee(int empid, int depid) {
		Employee emp = employeeDao.getById(empid);
		Department dep = departmentDao.getById(depid);
		emp.setDepartment(dep);
		employeeDao.save(emp);
		return emp;
	}
}
