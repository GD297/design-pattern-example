package com.dinhgt.pattern.creational.abstractfactory.database;

import com.dinhgt.pattern.creational.abstractfactory.factory.DatasourceAbstractFactory;
import com.dinhgt.pattern.creational.abstractfactory.models.Connection;
import com.dinhgt.pattern.creational.abstractfactory.models.Response;

public class DatabaseFactory implements DatasourceAbstractFactory {
    @Override
    public Connection createConnection() {
        return new DatabaseService();
    }

    @Override
    public Response createResponse() {
        return new DatabaseResponse();
    }
}
