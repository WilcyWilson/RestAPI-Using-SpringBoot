package com.codehimalaya.assignmen.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codehimalaya.assignmen.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
