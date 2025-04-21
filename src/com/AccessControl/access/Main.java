package com.AccessControl.access;

public class Main {
    public static void main(String[] args) {

        A obj = new A(21 , 108 , "pratiksha pandey" , "Mamma love");

         int age = obj.age;
         System.out.println(age);

        // obj.num; // cant Access it because its private
       // obj.getNum();

    }
}
