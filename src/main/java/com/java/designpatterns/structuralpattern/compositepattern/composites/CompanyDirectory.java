package com.java.designpatterns.structuralpattern.compositepattern.composites;

import com.java.designpatterns.structuralpattern.compositepattern.interfacesandabstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {
    private final List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
