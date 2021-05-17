package com.java.designpatterns.behavioralpattern.observerpattern.interfacesandabstracts;

import com.java.designpatterns.behavioralpattern.observerpattern.Message;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 16-05-2021
 * Time: 13:26
 */
public interface IProducer {

    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void notifyUpdate(Message message);
}
