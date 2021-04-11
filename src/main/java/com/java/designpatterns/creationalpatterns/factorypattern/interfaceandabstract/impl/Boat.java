package com.java.designpatterns.creationalpatterns.factorypattern.interfaceandabstract.impl;

import com.java.designpatterns.creationalpatterns.factorypattern.interfaceandabstract.HeadPhones;

public class Boat extends HeadPhones {

    public String headPhoneType;
    public String headPhonePrice;

    @Override
    public String headPhoneType(String type) {
        headPhoneType = type;
        return type;
    }

    @Override
    public String headPhonePrice() {
        headPhonePrice = "5000";
        return headPhonePrice;
    }

    @Override
    public String getDetailsOfHeadPhones() {
        return "You selected Boat Headphones of type "+headPhoneType + " and price is "+headPhonePrice() + " INR ";
    }


}
