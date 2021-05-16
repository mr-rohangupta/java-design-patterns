package com.java.designpatterns.behaviorpattern.observerpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behaviorpattern.observerpattern.Message;
import com.java.designpatterns.behaviorpattern.observerpattern.interfacesandabstracts.Observer;

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
