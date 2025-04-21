package com.IntroductionOops;

public class ConstructorsIntro {
    public static void main(String[] args) {

        // default constructor ko  call karega
        Student1 ss1 = new Student1();
          ss1.greeting();
          System.out.println(ss1.rno);
          System.out.println(ss1.name);
          System.out.println(ss1.marks);

        // parameterized constructor ko call karega yeh wala
        Student1 ss12 = new Student1(140 , "pratiksha" , 8.65f);
           System.out.println(ss12.rno);
           System.out.println(ss12.name);
           System.out.println(ss12.marks);

        //  copy constructor ko call karega yeh wala
        Student1  copy  = new Student1(ss12);
          System.out.println(copy.rno);
          System.out.println(copy.name);
          System.out.println(copy.marks);

          // calling a constructor inside another constructor
          Student1 random  = new Student1();
          System.out.println(random.name);
    }
}

class Student1 {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello!! my name is  " + name);
    }

    // default constructor
//    Student1(){  // here this keyword internally call
//        // object  ss1 means ss1.rno
//        this.rno =  13;
//        this.name = "pratiksha pandey";
//        this.marks = 8.65f;
//    }

    // here i'm making a constructor inside another constructor
    Student1(){
       this(13, "calling another constructor" , 9.00f);
    }

    // Student1 priya = new  Student1();
    // here this will be replaced with arpit
    // parameterized constructor
    Student1(int roll ,String name , float marks){
        this.rno =  roll;
        this.name = name;
        this.marks = marks;
    }

    // copy constructor
    Student1 (Student1 other){
        this.rno   = other.rno;
        this.name  = other.name;
        this.marks = other.marks;
    }
}