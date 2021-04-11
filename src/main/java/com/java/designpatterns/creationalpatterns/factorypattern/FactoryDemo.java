package com.java.designpatterns.creationalpatterns.factorypattern;

import com.java.designpatterns.creationalpatterns.factorypattern.factories.HeadPhoneFactory;
import com.java.designpatterns.creationalpatterns.factorypattern.interfaceandabstract.HeadPhones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryDemo {
    public static void main(String[] args) throws IOException {
        HeadPhoneFactory headPhoneFactory = new HeadPhoneFactory();
        System.out.println("Welcome Please Specify the Brand of your choice we have Boat, JBL and Sony ..");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String brandName = bufferedReader.readLine();
        System.out.println("Please enter the type of HeadPhone you want TWS, Bluetooth or Neckband");
        String headPhoneType = bufferedReader.readLine();
        HeadPhones headPhones = headPhoneFactory.getHeadPhones(brandName);
        headPhones.headPhoneType(headPhoneType);
        String detailsOfHeadPhones = headPhones.getDetailsOfHeadPhones();
        System.out.println(detailsOfHeadPhones);
    }
}
