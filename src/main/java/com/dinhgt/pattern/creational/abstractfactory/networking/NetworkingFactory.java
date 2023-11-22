package com.dinhgt.pattern.creational.abstractfactory.networking;

import com.dinhgt.pattern.creational.abstractfactory.factory.DatasourceAbstractFactory;
import com.dinhgt.pattern.creational.abstractfactory.models.Connection;
import com.dinhgt.pattern.creational.abstractfactory.models.Response;

public class NetworkingFactory implements DatasourceAbstractFactory {
    @Override
    public Connection createConnection() {
        return new NetworkingService();
    }

    @Override
    public Response createResponse() {
        return new NetworkingResponse();
    }
}
