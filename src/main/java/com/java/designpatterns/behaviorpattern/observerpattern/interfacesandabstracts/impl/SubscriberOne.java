package com.java.designpatterns.behaviorpattern.observerpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behaviorpattern.observerpattern.Message;
import com.java.designpatterns.behaviorpattern.observerpattern.interfacesandabstracts.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 16-05-2021
 * Time: 13:35
 */
public class SubscriberOne implements Observer {

    @Override
    public void receive(Message message) {
        System.out.println("Message Subscriber One: " + message.getMessageContent());
    }
}
