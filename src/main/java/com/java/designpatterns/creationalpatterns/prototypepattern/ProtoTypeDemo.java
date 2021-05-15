package com.java.designpatterns.creationalpatterns.prototypepattern;

import com.java.designpatterns.creationalpatterns.prototypepattern.factories.ProtoTypeFactory;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class ProtoTypeDemo {

    public static void main(String[] args) {
        try {
            String iosType = ProtoTypeFactory.getInstance(ProtoTypeFactory.OSType.IOS).toString();
            System.out.println(iosType);

            String windowsType = ProtoTypeFactory.getInstance(ProtoTypeFactory.OSType.WINDOWS).toString();
            System.out.println(windowsType);

            String ubuntuType = ProtoTypeFactory.getInstance(ProtoTypeFactory.OSType.UBUNTU).toString();
            System.out.println(ubuntuType);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
