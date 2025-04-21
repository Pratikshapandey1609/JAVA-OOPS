package com.AbstractionInterface.AbstractClasses.CodeAbstractExample;

// if class have an abstract method it must make a class as abstract
// you cant make a abstract class as a final

public abstract class Parent {

    // normal variable
    int age;

    // constructor off parent class
    // can you call this no you cant create an object of abstract class
    public Parent(int age){
        this.age = age;
    }
    // abstract Parent(); // cant create a abstract constructor

    // you cannot create an abstract static method ,
    // but you can create a static method in abstract classes

    static void hello(){
        System.out.println("i am static and i am inside abstract classes");
    }

    void normal(){
        System.out.println("i am normal method inside abstract class ");
    }
    //abstract method not have body {}
    abstract void career();
    abstract void partner();


}
