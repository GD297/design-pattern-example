package com.dinhgt.pattern.creational.singleton;

public class EagerInitialization {
    // You can create instance musicPlayer 2 ways
    //1. new Object directly
    private static final EagerInitialization EAGER_INITIALIZATION = new EagerInitialization();

    //2. Use static block
//    private static final EagerInitialization EAGER_INITIALIZATION;
//    static{
//        EAGER_INITIALIZATION = new EagerInitialization();
//    }

    private EagerInitialization() {
    }
    public static EagerInitialization getInstance(){
        return EAGER_INITIALIZATION;
    }
}
