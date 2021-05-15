package com.java.designpatterns.structuralpattern.compositepattern.interfacesandabstracts.impl;

import com.java.designpatterns.structuralpattern.compositepattern.interfacesandabstracts.Employee;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class Developer implements Employee {
    private final String name;
    private final long empId;
    private final String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name);
    }
}
