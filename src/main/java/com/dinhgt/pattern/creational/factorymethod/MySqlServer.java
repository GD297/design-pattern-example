package com.dinhgt.pattern.creational.factorymethod;

public class MySqlServer implements Database {
    @Override
    public void getConnection() {
        //TODO some connection to database
        System.out.println("Some Connection MySql Database Logging");
    }
}
