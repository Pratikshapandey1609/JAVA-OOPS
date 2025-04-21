package com.IntroductionOops;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {

        /*class is an blueprint of object
        * logical construct **/

        /* object is instance of class
         * Physical reality
         *  things 1) state of the object
         * 2) identity of the object
         * 3) behaviour of the object
         * by default when value is not initialized it gives null **/

        Student[] student1 = new Student[5];
        // just declaring it
        Student pratiksha;
        System.out.println(Arrays.toString(student1)); // it gives some random values

        Student student2 =   new Student();
        System.out.println(student2.rno); // gives 0 bcoz by default value of int is 0
        System.out.println(student2.name); // gives 0 bcoz by default value of int is null
        System.out.println(student2.marks); // gives 0 bcoz by default value of int is 0.0

        student2.rno = 140;
        student2.name = "pratiksha";
        student2.marks = 8;

        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);
    }
}

class Student{
    int rno;
    String name;
    float marks;
}

