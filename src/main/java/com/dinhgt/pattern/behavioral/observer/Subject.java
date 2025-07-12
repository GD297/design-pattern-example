package com.dinhgt.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String message;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update(message);
        }
    }

    public void createMessage(String message){
        this.message = message;
        notifyAllObservers();
    }
}
