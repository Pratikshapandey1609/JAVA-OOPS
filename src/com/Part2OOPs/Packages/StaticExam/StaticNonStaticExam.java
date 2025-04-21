package com.Part2OOPs.Packages.StaticExam;

public class StaticNonStaticExam {
    public static  void main(String[] args) {
        /* its giving me error and saying you cant use
        * non-static method inside static context
        * you cannot use this keyword inside static keyword as you know this  is something which is used with objects
        *  **/

        //greeting();
        greet();  // greet is static so yu can use it here
    }

    // not dependent on objects
    static void fun(){
        StaticNonStaticExam obj = new StaticNonStaticExam();
        obj.greeting(); // use it via creating an object of main class
        //greeting(); // cant call non static inside static
    }

    // dependent on objects
    // we know something which is not static belong to objects
    public void greeting(){
        fun();
        System.out.println("hello i am greeting method");
    }

    //dont need object  bcoz its static
    public static void greet(){
        System.out.println("hello i am greet method");
    }
}
