package com.dinhgt.pattern.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new ObserverImpl("John"));
        subject.attach(new ObserverImpl("Alice"));
        subject.createMessage("Hello");
    }
}
