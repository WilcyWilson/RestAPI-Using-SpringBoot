package com.codehimalaya.assignmen.dto;

public class EmployeeDto {
    private int id;

    private String name;

    private String departmentName;

//    private Long departmentId;


    // getter and setter


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
