package com.java.designpatterns.creationalpatterns.singletonpattern;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class Database implements Serializable,Cloneable {

    private static volatile Database DATABASE_INSTANCE = null;

    public int i;

    //Private Constructor so that no one can create object from outside
    private Database() throws InstantiationException {
        //Checking Nullability of object for preventing it from Reflections
        if(DATABASE_INSTANCE != null){
            throw new InstantiationException("Creation of singleton is not allowed ..!!");
        }
    }

    //Always return the same instance
    public synchronized static Database getInstance() throws InstantiationException {
        if (DATABASE_INSTANCE == null) {
            DATABASE_INSTANCE = new Database();
        }
        return DATABASE_INSTANCE;
    }

    //readObject and readResolve method is used to prevent breaking of singleton from serialization
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        DATABASE_INSTANCE = this;
    }

    private Object readResolve()  {
        return DATABASE_INSTANCE;
    }

    //Overriding to prevent it from cloning you can either throw exception or return the same instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
       // throw new CloneNotSupportedException();
        return DATABASE_INSTANCE;
    }


    public void getConnectionFromDatabase() {
        System.out.println("You are Successfully connected to Database ..!!");
    }
}
