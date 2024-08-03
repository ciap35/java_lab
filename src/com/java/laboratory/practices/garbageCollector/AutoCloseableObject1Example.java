package com.java.laboratory.practices.garbageCollector;

public class AutoCloseableObject1Example implements AutoCloseable{

    public void execute(){
        System.out.println("Executing some stuff from Object 1");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Calling close method and clean the objects manually");
    }
}
