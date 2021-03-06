package com.java.designpatterns.structuralpattern.compositepattern.interfacesandabstracts.impl;

import com.java.designpatterns.structuralpattern.compositepattern.interfacesandabstracts.Employee;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class QA implements Employee {
    private String name;
    private long empId;
    private String position;

    public QA(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails()
    {
        System.out.println(empId+" " +name);
    }
}
