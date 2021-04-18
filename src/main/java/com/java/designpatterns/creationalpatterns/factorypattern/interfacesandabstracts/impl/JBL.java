package com.java.designpatterns.creationalpatterns.factorypattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.factorypattern.interfacesandabstracts.HeadPhones;

public class JBL extends HeadPhones {
    public String headPhoneType;
    public String headPhonePrice;

    @Override
    public String headPhoneType(String type) {
        headPhoneType = type;
        return type;
    }

    @Override
    public String headPhonePrice() {
        headPhonePrice = "25000";
        return headPhonePrice;
    }

    @Override
    public String getDetailsOfHeadPhones() {
        return "You selected JBL Headphones of type "+headPhoneType + " and price is "+headPhonePrice() + " INR ";
    }
}
