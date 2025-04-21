package com.AbstractionInterface.Interface.CodeInterfaceExample;

public class ElectricEngine implements  Engine{

    @java.lang.Override
    public void start() {
        System.out.println("I can start Electric  Engine");
    }

    @java.lang.Override
    public void stop() {
        System.out.println("I can stop Electric  Engine");
    }

    @java.lang.Override
    public void acc() {
        System.out.println("I can Accelerator Electric  Engine");
    }
}
