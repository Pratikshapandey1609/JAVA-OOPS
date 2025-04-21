package com.AbstractionInterface.Interface;

interface InterfaceTheory {
    /**
     * 🧠 What is an Interface in Java?

     * An interface in Java is like a contract or a blueprint for classes.
     * It contains abstract methods (by default) that any class implementing it must define,
     * An interface is a pure abstraction — a collection of abstract methods (method signatures without body)
       that defines what a class should do, not how.
     * static interface methods should have a body

     * nested interface can be public private or protected ,
     * but top level interface must have to public or default one

     * interface can implement multiple interface

     * Abstract class provide the implementation of interface
     * but interface can't provide the implementation of abstract classes
     * ✅ Java supports multiple inheritance through interfaces, not classes.

     * Java interfaces:----------->>
     * Cannot have instance fields (only public static final constants).
     * Methods are public abstract by default.
     * At runtime, interfaces are loaded into method area, just like classes.
     * When a class implements an interface, the JVM ensures the class has implemented all interface methods.

     *💡 Key Points:
     * any variable inside interface is by default static and final ,
     * Interface Can contain Abstract methods (by default), default, static, and private methods
     * No Constructors Interface Can’t be instantiated
     * Implementation Interface implements keyword is used
     * Multiple Interfaces	A class can implement multiple interfaces
     *
     * you can create a separate classes for interfaces in java
     *
     * **/

    // example of interfaces Syntax
    interface Vehicle {
        void start(); // by default abstract methods
        void stop();
    }
}
