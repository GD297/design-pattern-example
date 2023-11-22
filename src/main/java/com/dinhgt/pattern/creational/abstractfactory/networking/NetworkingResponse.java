package com.dinhgt.pattern.creational.abstractfactory.networking;

import com.dinhgt.pattern.creational.abstractfactory.models.Response;

public class NetworkingResponse implements Response {
    @Override
    public void getResult() {
        System.out.println("Return some network response");
    }
}
