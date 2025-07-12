package com.dinhgt.pattern.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "John");
        User user2 = new UserImpl(mediator, "Alice");
        mediator.addUser(user1);
        mediator.addUser(user2);
        user1.send("Hi all");
    }
}
