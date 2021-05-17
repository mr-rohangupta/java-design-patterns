package com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behavioralpattern.observerpattern.Message;
import com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 16-05-2021
 * Time: 13:38
 */
public class SubscriberThree implements Observer {
    @Override
    public void receive(Message message) {
        System.out.println("Message Subscriber Three: " + message.getMessageContent());
    }
}
