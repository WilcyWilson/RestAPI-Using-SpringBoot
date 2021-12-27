package com.codehimalaya.assignmen.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codehimalaya.assignmen.entities.Employee;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{


//    @Query(value = "SELECT * FROM EMPLOYEE" ,nativeQuery = true)


}
