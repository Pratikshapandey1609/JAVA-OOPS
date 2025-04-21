package com.AbstractionInterface.AbstractClasses;

public class AbstractTheory {

    /** 🧩 What is an Abstract Class?

     *An abstract class in Java is a class that cannot be instantiated, and it may contain abstract methods (without body)
       and concrete methods (with body).
     * you cannot create an abstract static method ,
     * but you can create a static method in abstract classes
     * you cant implement multiple inheritance in   Abstract means abstract is not a solution of multiple inheritance


     * Feature
     * ✅ Contains both abstract and concrete methods and static methods also
     * ❌ Cannot be instantiated directly
     * ✅ Can have constructors
     * ✅ Can have instance variables and static members
     * ✅ Supports access modifiers (private, protected, public)
     * ✅ Supports inheritance (extends keyword)

     * 🧠 What is an Abstract Method?

     * An abstract method is a method without a body — just a declaration.
     * It is meant to be overridden in a subclass.
     *  for example--->    abstract void draw();
     * 📌It can only exist inside an abstract class or interface.
     *    if a class contain one or more then one abstract method class must have to be abstract class

     * ✅ Rules of Abstract Methods:---------->
     * ❌ No method body	Ends with ;, not {}
     *      * ✅ Must be in abstract class or interface
     *      *    we cannot create abstract  static methods
     *      * ❌ Cannot be private, static, or final Because they must be overridden
     * ✅ Must be overridden in subclass Unless the subclass is also abstract

     * ❓ If a subclass is abstract, can it override abstract methods?
     * 👉 YES, it can override abstract methods.
     * 👉 BUT it is not required to override all abstract methods

     * 👉 Abstract Constructor are not allowed you can't make an Abstract constructor
     * **/
}
