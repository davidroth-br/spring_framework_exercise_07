package com.montrealcollege.exercise7.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private String fullName;

    @Autowired
    private Department department;

    public Employee() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                '}';
    }
}
