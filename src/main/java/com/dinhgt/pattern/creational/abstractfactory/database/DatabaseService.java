package com.dinhgt.pattern.creational.abstractfactory.database;

import com.dinhgt.pattern.creational.abstractfactory.models.Connection;

public class DatabaseService implements Connection {
    @Override
    public void getConnection() {
        System.out.println("Return some database connection");
    }
}
