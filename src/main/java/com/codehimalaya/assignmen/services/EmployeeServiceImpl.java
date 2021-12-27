package com.codehimalaya.assignmen.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.codehimalaya.assignmen.dto.EmployeeDto;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
//				new Employee(3,"Wilson"),
//				new Employee(4,"Manoj")
//

		return employeeDao.findAll();
	}

	@Override
	public ResponseEntity<Object> getEmployeeData() {
		List<Employee> employeeList= employeeDao.findAll();

		List<EmployeeDto> employeeDtoList = new ArrayList<>();


		employeeList.forEach(
			el -> {

				EmployeeDto employeeDto = new EmployeeDto();

				employeeDto.setId(el.getEmployeeId());
				employeeDto.setName(el.getName());

				employeeDto.setDepartmentName(el.getDepartment() != null ? el.getDepartment().getName() : "N/A" );


				employeeDtoList.add(employeeDto);
			}
		);

		return new ResponseEntity<>(employeeDtoList, HttpStatus.OK);
	}


	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.getById(employeeId);
	}
}
