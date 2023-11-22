package com.dinhgt.pattern.creational.abstractfactory;

import com.dinhgt.pattern.creational.abstractfactory.client.Client;
import com.dinhgt.pattern.creational.abstractfactory.database.DatabaseFactory;
import com.dinhgt.pattern.creational.abstractfactory.networking.NetworkingFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Client databaseClient = new Client(new DatabaseFactory());
        databaseClient.communicate();

        Client networkClient = new Client(new NetworkingFactory());
        networkClient.communicate();
    }
}
