package com.AbstractionInterface.Interface.ExtendInterface;

public interface A {

    // static interface methods  should always have a body
    // call via interface name

    // static  void greeting(); it gives  error in this

    static void greeting(){
        System.out.println("hey  I am  from greeting methods");
    }

    void fun();
}
