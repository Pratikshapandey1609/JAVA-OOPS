package com.AbstractionInterface.AbstractClasses.CodeAbstractExample;

public class Daughter extends Parent {

    //child class constructor
    public Daughter(int age){
        super(22);
        this.age = age;
    }

    void normal() {
        super.normal();
    }

    @java.lang.Override
    void career() {
        System.out.println("I am going to become a coder");
    }

    @java.lang.Override
    void partner() {
        System.out.println("I am going to become a shiv");
    }
}
