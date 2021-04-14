package com.java.designpatterns.creationalpatterns.prototypepattern.factories;

import com.java.designpatterns.creationalpatterns.prototypepattern.interfaceandabstract.OperatingSystem;
import com.java.designpatterns.creationalpatterns.prototypepattern.interfaceandabstract.impl.IOS;
import com.java.designpatterns.creationalpatterns.prototypepattern.interfaceandabstract.impl.Ubuntu;
import com.java.designpatterns.creationalpatterns.prototypepattern.interfaceandabstract.impl.Windows;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeFactory {

    private static final Map<String, OperatingSystem> prototypes = new HashMap<>();

    static {
        prototypes.put(OSType.IOS, new IOS());
        prototypes.put(OSType.WINDOWS, new Windows());
        prototypes.put(OSType.UBUNTU, new Ubuntu());
    }

    public static OperatingSystem getInstance(final String s) throws CloneNotSupportedException {
        return (prototypes.get(s)).clone();
    }

    public static class OSType {
        public static final String IOS = "ios";
        public static final String WINDOWS = "windows";
        public static final String UBUNTU = "ubuntu";
    }
}
