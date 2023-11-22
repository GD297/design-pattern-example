package com.dinhgt.pattern.creational.abstractfactory.client;

import com.dinhgt.pattern.creational.abstractfactory.factory.DatasourceAbstractFactory;
import com.dinhgt.pattern.creational.abstractfactory.models.Connection;
import com.dinhgt.pattern.creational.abstractfactory.models.Response;

public class Client {
    private Connection connection;
    private Response response;

    public Client(DatasourceAbstractFactory datasourceAbstractFactory) {
        this.connection = datasourceAbstractFactory.createConnection();
        this.response = datasourceAbstractFactory.createResponse();
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public void communicate(){
        if(connection != null && response != null) {
            connection.getConnection();
            response.getResult();
        }
    }
}
