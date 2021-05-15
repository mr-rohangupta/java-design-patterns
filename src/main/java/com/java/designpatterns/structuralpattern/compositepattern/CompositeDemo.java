package com.java.designpatterns.structuralpattern.compositepattern;

import com.java.designpatterns.structuralpattern.compositepattern.composites.CompanyDirectory;
import com.java.designpatterns.structuralpattern.compositepattern.interfacesandabstracts.impl.Developer;
import com.java.designpatterns.structuralpattern.compositepattern.interfacesandabstracts.impl.QA;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class CompositeDemo {

    public static void main(String[] args) {
        Developer dev1 = new Developer(1001, "Vinod Wadhwani", "Developer");
        Developer dev2 = new Developer(1002, "Katuri Babu", "Developer");
        CompanyDirectory devDirectory = new CompanyDirectory();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);

        QA qa1 = new QA(1003, "Mallika Arjuna Palluchari", "Senior QA");
        QA qa2 = new QA(1004, "Rajiv Makkhija ", "QA Manager");

        CompanyDirectory qaDirectory = new CompanyDirectory();
        qaDirectory.addEmployee(qa1);
        qaDirectory.addEmployee(qa2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(devDirectory);
        directory.addEmployee(qaDirectory);
        directory.showEmployeeDetails();
    }
}
