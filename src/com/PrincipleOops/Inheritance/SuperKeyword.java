package com.PrincipleOops.Inheritance;

/** THE super keyword in java iis used in inheritance to refer to parent class(super class) of subclass

 * super in static methods?	❌ Not allowed (static belongs to the class, super needs an instance)
 * super refers to an instance of the parent class.
 * Static methods belong to the class, not an instance.
 * Since super requires an object context, it cannot be used in static methods.

 * ---------------------> 1️⃣ Uses of super <-----------------------------------
 * ✅ (A) Access Parent Class Variables ----- > super.variableName
 * for example super.l;

 * ✅ (B) Call Parent Class Methods  ----> If a child class overrides a method from its parent,
       super can call the parent’s version.

 * ✅ (C) Call Parent Class Constructor ----> super() is used to call the constructor of the parent class
       from a subclass constructor.
      ## This must be the first statement in a subclass constructor.
 * **/

//parent class
public class SuperKeyword {
 int num = 100; // parent class variable

    void display(){ // method in parent class
        System.out.println("parent' display() method  ");
    }

     SuperKeyword(){
        System.out.println("parent class constructor");
    }
}

class child extends SuperKeyword{
    int num = 200; // child class variable

    void display(){
        System.out.println("child's display() methods  here");
        super.display(); // calling the super class method using super keyword
    }

    child(){
        super(); // it calls the parent class constructor
        System.out.println("child constructor");
    }

    void show(){
        System.out.println("child variable is: " + num);
        // in this  we are accessing parent class variable so use super keyword
        System.out.println("parent  class variable is : " + super.num);
    }
}
