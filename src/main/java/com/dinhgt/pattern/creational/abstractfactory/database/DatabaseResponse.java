package com.dinhgt.pattern.creational.abstractfactory.database;

import com.dinhgt.pattern.creational.abstractfactory.models.Response;

public class DatabaseResponse implements Response {
    @Override
    public void getResult() {
        System.out.println("Return some database response");
    }
}
