package com.AbstractionInterface.Interface.ExtendInterface;

public class ChildExtending implements B {

    @java.lang.Override
    public void greet() {
        System.out.println("I am from class B extending in main");
    }

    @java.lang.Override
    public void fun() {
        System.out.println("I am from class A but first extending by class B and then by main ");
    }
}
