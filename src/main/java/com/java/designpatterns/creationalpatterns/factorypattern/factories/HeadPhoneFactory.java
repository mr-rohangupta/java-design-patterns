package com.java.designpatterns.creationalpatterns.factorypattern.factories;

import com.java.designpatterns.creationalpatterns.factorypattern.interfaceandabstract.HeadPhones;
import com.java.designpatterns.creationalpatterns.factorypattern.interfaceandabstract.impl.Boat;
import com.java.designpatterns.creationalpatterns.factorypattern.interfaceandabstract.impl.JBL;
import com.java.designpatterns.creationalpatterns.factorypattern.interfaceandabstract.impl.Sony;

public class HeadPhoneFactory {

    public HeadPhones getHeadPhones(String choice){
        if(choice == null){
            throw new RuntimeException("Provide Valid Name");
        }
        if(choice.equalsIgnoreCase("Boat")){
            return new Boat();
        }
        else if(choice.equalsIgnoreCase("JBL")){
            return new JBL();
        }
        else if(choice.equalsIgnoreCase("Sony")){
            return new Sony();
        }
        return null;
    }

}
