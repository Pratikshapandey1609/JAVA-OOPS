package com.AccessControl.access;

public class SubClass extends A {

    public SubClass(int age, int num, String name, String MotherName) {
        super(age, num, name, MotherName);
    }

    public static void main(String[] args) {
        SubClass child =  new SubClass(20 , 467 , "pratiksha" , "mummy Love");

        // means you can access protected in subclass in same package only also
        String mother = child.MotherName;
        System.out.println(mother);
    }
}
