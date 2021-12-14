package com.codehimalaya.assignmen.services;

import com.codehimalaya.assignmen.entities.Department;
import com.codehimalaya.assignmen.entities.Employee;

public interface DepartmentService {
	public Department addDepartment(Department department);
	public Employee assignEmployee(int empid, int depid);
}
