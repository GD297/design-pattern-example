package com.dinhgt.pattern.creational.factorymethod;

public class OracleDatabase implements Database {
    @Override
    public void getConnection() {
        //TODO some connection to database
        System.out.println("Some Connection Oracle Database Logging");
    }
}
