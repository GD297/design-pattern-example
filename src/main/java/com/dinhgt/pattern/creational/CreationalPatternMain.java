package com.dinhgt.pattern.creational;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CreationalPatternMain {

    public static void main(String[] args) throws InterruptedException {
        // Eager Initialization
        System.out.println("####Eager Initialization####");
        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization1 == eagerInitialization2);
        System.out.println("############################");


        // Lazy Initialization
        System.out.println("####Lazy Initialization####");
        LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
        LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();
        System.out.println(lazyInitialization1 == lazyInitialization2);
        System.out.println("############################");

        /*Thread Safe Initialization
         * in-case multiple thread access the same methods getInstance, it might be work not correctly
         */
        System.out.println("####Thread Safe Initialization####");
        ThreadSafeInitialization threadSafeInitialization1 = ThreadSafeInitialization.getInstanceWithSynchronize();
        ThreadSafeInitialization threadSafeInitialization2 = ThreadSafeInitialization.getInstanceWithSynchronize();
        System.out.println(threadSafeInitialization1 == threadSafeInitialization2);
        System.out.println("############################");



    }

}
