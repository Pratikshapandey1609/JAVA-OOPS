package com.IntroductionOops;

public class WrapperClasses {
    public static void main(String[] args) {

//        int a = 10;
//        Integer num = 78; // num is an working as an object of class integer

        Integer a = 10;
        Integer b = 80;
        swap(a , b);

        // its not swapping because Integer class is final class
        System.out.println(a + " " +b);
    }
    static void swap(Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
