package com.PrincipleOops.Polymorphism;

public class MethodOverloading {
     /***
      // here we are performing method overloading
     //  where we have multiple methods with same name but different in perameters
    // type of complie time polymorphism
    **/

    int sum (int a){
        return a ;
    }

    int sum (int a , int b){
        return a + b;
    }
    int sum(int a , int b , int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading num = new MethodOverloading();

        num.sum(4);
        num.sum(6 , 8);
        num.sum(9 , 18, 27);
    }
}
