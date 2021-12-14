package com.codehimalaya.assignmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codehimalaya.assignmen.entities.Department;
import com.codehimalaya.assignmen.entities.Employee;
import com.codehimalaya.assignmen.services.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	// 3. Create new Department
	@PostMapping("/departments")
	public Department addDepartment(@RequestBody Department department) {
		return this.departmentService.addDepartment(department);
	}
	
	// 4. Assign am employee by their employee id
	@PutMapping("/departments/{empid}/{depid}")
	public Employee assignEmployee(@PathVariable int empid, @PathVariable int depid ) {
		return this.departmentService.assignEmployee(empid, depid);
	}
}
