package com.AbstractionInterface.Interface.CodeInterfaceExample;

public class PowerEngine implements Engine{

    @java.lang.Override
    public void start() {
        System.out.println("I can start Power Engine");
    }

    @java.lang.Override
    public void stop() {
        System.out.println("I can stop am Power Engine");
    }

    @java.lang.Override
    public void acc() {
        System.out.println("I can Accelerator Power Engine");
    }
}
