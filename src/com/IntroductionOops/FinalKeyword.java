package com.IntroductionOops;

public class FinalKeyword {
    public static void main(String[] args) {

        /** final keyword in java once you initialize variable cant modify it
         * use it with class , function  , variable
         * initialize it while declaration
         * final have to be initialized important
         * it generates its mutability while you are working with primitive data type
         * when  non-primitive is final  you can modify it but can reassign it
         **/

        // primitive so you cant change its value
        final int  me = 10;
        //me = 90; // gives error you cant  modify final keyword once initialize it
        System.out.println(me);

        // non-primitive so you can change its value but cannot reassign it
        final A  priya = new A("pratiksha pandey");
        priya.name = "new name yiu can change name here ";
        //priya = new A("you cannot reAssign it");
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}