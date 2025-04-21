package com.AbstractionInterface.Interface.CodeInterfaceExample;

// so previously you are not able to extend a multiple class in single class
// ,but now you can do it

public class Car implements  Engine , Brake , Media{

    int a = 10;

    @java.lang.Override
    public void brake() {
        System.out.println("I am able to break/slow down a car");
    }

    @java.lang.Override
    public void start() {
        System.out.println("I am able to Start a car");
    }

    @java.lang.Override
    public void stop() {
        System.out.println("I am able to stop a car");
    }

//    public void stop() {
//        System.out.println("I am able to stop  a car Engine ");
//        // output of it  which occur issue
//        // "I am able to Accelerator / fast up the car"
//    }


    @java.lang.Override
    public void acc() {
        System.out.println("I am able to Accelerator / fast up the car");
    }
}
