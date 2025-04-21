package com.Part2OOPs.Packages.StaticExam;

public class Main {
    public static void main(String[] args) {

        Human pratiksha = new Human(22 , "pratiksha" , 20000 , false);
        Human priya = new Human(26 , "priya" , 7800 , true);
        Human pihu  = new Human(29 , "pihu" , 26000 , false);

        System.out.println(pratiksha.name);
        System.out.println(priya.salary);
        System.out.println(pratiksha.population);
        System.out.println(priya.population);

        //  whenever you are accessing static variable modifying or declaring it dont  do it like this
        //  using refrence variable
        //  System.out.println(pratiksha.population);
        //  instead use class name

        System.out.println(Human.population);
    }
}
