package com.Part2OOPs.Packages.StaticExam;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age , String name,int salary , boolean married){
        this.age     =  age;
        this.name    =  name;
        this.salary  =  salary;
        this.married =  married;

        // in order to access static variable use class name
        Human.population += 1;

    }
}
