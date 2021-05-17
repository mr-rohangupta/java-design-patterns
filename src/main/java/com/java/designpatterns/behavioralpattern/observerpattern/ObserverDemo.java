package com.java.designpatterns.behavioralpattern.observerpattern;

import com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.impl.MessagePublisher;
import com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.impl.SubscriberOne;
import com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.impl.SubscriberThree;
import com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts.impl.SubscriberTwo;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 16-05-2021
 * Time: 13:40
 */
public class ObserverDemo {
    public static void main(String[] args) {
        SubscriberOne subscriberOne = new SubscriberOne();
        SubscriberTwo subscriberTwo = new SubscriberTwo();
        SubscriberThree subscriberThree = new SubscriberThree();

        MessagePublisher messagePublisher = new MessagePublisher();
        messagePublisher.subscribe(subscriberOne);
        messagePublisher.subscribe(subscriberTwo);

        messagePublisher.notifyUpdate(new Message("You are Successfully Subscribed ..!!"));

        messagePublisher.unSubscribe(subscriberOne);
        messagePublisher.subscribe(subscriberThree);

        messagePublisher.notifyUpdate(new Message("One member successfully subscribed and one member is unsubscribed ..!!"));

    }
}
