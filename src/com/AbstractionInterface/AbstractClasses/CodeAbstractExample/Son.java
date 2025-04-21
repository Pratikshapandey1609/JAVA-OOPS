package com.AbstractionInterface.AbstractClasses.CodeAbstractExample;

public class Son extends Parent {

    // child class constructor
    public Son(int age){
        super(26);
        this.age = age;
    }

    @java.lang.Override
    void normal() {
        super.normal();
    }

    @java.lang.Override
    void career() {
        System.out.println("I am going to become a Doctor");
    }

    @java.lang.Override
    void partner() {
        System.out.println("I love my jyoti" );
    }
}
