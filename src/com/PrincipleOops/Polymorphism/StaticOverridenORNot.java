package com.PrincipleOops.Polymorphism;

public class StaticOverridenORNot {
    /**🔥 Yes — static methods are resolved using the reference type,
          not the object type. because This is because they are not instance methods
          they belong to the class.
    That’s why we say:
    🔒 Static methods are bound at compile time, not at runtime.**/

    //❓ Can We Override Static Methods in Java?
    /* No we cant override a static Methods Because static belong to class not the objects
     * Override is a concept of runtime polymorphism, and it always works on objects types
     * Since Static methods don't rely on objects, they are resolved during compile time----> this is method hidding not overriding
     *
     * so Static in polymorphism is hiding not overriding
     * **/

    public static void main(String[] args) {
        Parent p = new child();
        p.show(); //  // 👈 Output: Static method in Parent

        /* But why ?? P is a child class object but calling a parent class method why
        ➡️ Because show() is static and hence static resolved using a reference type not actual object
        ➡️ So , the method that gets  called is parent.show() is  hiding not overriding
        **/

    }
}
class Parent {
    static void show(){
        System.out.println("Static method in parent");
    }
}
class child extends Parent{
    static void show () {
        System.out.println("Static method in child ");
    }
}