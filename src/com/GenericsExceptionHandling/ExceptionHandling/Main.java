package com.GenericsExceptionHandling.ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try{
          //  int c = a / b;
              divide(a , b);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This is finally block always run weather is Exception is here or not");
        }
    }

    static int divide(int a , int b){
        if(b == 0){
            throw new ArithmeticException("Please do not divide by Zero use some other deviant");
        }
        return a / b;
    }
}
