package com.dinhgt.pattern.creational.abstractfactory.factory;

import com.dinhgt.pattern.creational.abstractfactory.models.Connection;
import com.dinhgt.pattern.creational.abstractfactory.models.Response;

public interface DatasourceAbstractFactory {

    Connection createConnection();
    Response createResponse();

}
