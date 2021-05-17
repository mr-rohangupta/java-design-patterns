package com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behavioralpattern.observerpattern.Message;
import com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.IProducer;
import com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 16-05-2021
 * Time: 13:32
 */
public class MessagePublisher implements IProducer {

    public List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        for (Observer observers : observers) {
            observers.receive(message);
        }
    }
}
