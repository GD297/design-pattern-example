package com.dinhgt.pattern.creational;

public class ThreadSafeInitialization {
    private static ThreadSafeInitialization threadSafeInitialization;
    private static ThreadSafeInitialization threadSafeInitializationWithSynchronize;

    private ThreadSafeInitialization() {
    }

    public static ThreadSafeInitialization getInstance() {
        // This condition might be work not correctly in multiple thread
        if(threadSafeInitialization == null){
            threadSafeInitialization = new ThreadSafeInitialization();
        }
        return threadSafeInitialization;
    }
    public static ThreadSafeInitialization getInstanceWithSynchronize(){
        synchronized (ThreadSafeInitialization.class){
            if(threadSafeInitializationWithSynchronize == null){
                threadSafeInitializationWithSynchronize = new ThreadSafeInitialization();
            }
        }
        return threadSafeInitializationWithSynchronize;
    }
}
