package com.java.designpatterns.creationalpatterns.singletonpattern;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonDemo {
    public static void main(String[] args) throws InstantiationException, IOException, ClassNotFoundException, CloneNotSupportedException {
        Database instance = Database.getInstance();
        instance.getConnectionFromDatabase();


        //TODO Trying to Break it using Serialization
        Database breakingUsingSingleton = Database.getInstance();
        breakingUsingSingleton.i = 5;
        ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(Database.getInstance());
        objectOutputStream.close();

        breakingUsingSingleton.i = 7; //modified after serialization

        InputStream is = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(is);
        Database deserialized = (Database) objectInputStream.readObject();
        System.out.println(deserialized.i);  // prints 5

        //TODO Trying to Break it using cloning
        Database cloneableFirstInstance = Database.getInstance();
        Database cloneableSecondInstance = (Database) cloneableFirstInstance.clone();

        System.out.println(cloneableFirstInstance.hashCode());
        System.out.println(cloneableSecondInstance.hashCode());

        //TODO Trying to Break it using Reflections
        Database firstInstance = Database.getInstance();
        Database secondInstance = null;
        try {
            Constructor constructor = Database.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            secondInstance = (Database) constructor.newInstance();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("Hashcode of Object 1 - " + firstInstance.hashCode());
        System.out.println("Hashcode of Object 2 - " + secondInstance.hashCode());
    }
}
