package com.dinhgt.pattern.creational.builder;

public class BuilderMain {
    public static void main(String[] args){
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.setAge("23").setDob("30062000").setName("GIang THanh DInh").build();
    }
}
