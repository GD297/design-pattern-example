package com.dinhgt.pattern.creational.abstractfactory.networking;

import com.dinhgt.pattern.creational.abstractfactory.models.Connection;

public class NetworkingService implements Connection {
    @Override
    public void getConnection() {
        System.out.println("Return some network connection");
    }
}
