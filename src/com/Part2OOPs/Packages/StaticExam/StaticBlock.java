package com.Part2OOPs.Packages.StaticExam;

// deemo to show initializations of static variables

public class StaticBlock {
    static int a = 4;
    static int b ;

    /* static block is something  will run only once
    * when the first obj is created i.e. when the class is loaded first time **/
    static {
        System.out.println("I am a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
