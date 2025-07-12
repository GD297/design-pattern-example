package com.dinhgt.pattern.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remote = new RemoteControl();
        remote.submit(new LightOnCommand(light));
        remote.submit(new LightOffCommand(light));
    }
}
