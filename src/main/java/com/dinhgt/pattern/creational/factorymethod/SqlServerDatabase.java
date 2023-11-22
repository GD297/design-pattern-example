package com.dinhgt.pattern.creational.factorymethod;

public class SqlServerDatabase implements Database {
    @Override
    public void getConnection() {
        //TODO some connection to database
        System.out.println("Some Connection SqlServer Database Logging");
    }
}
