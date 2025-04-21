package com.Part2OOPs.Packages.Singleton;

public class Main {
    public static void main(String[] args) {

        SingletonClass obj =  SingletonClass.getInstance();

        SingletonClass obj1 =  SingletonClass.getInstance();

        SingletonClass obj2 =  SingletonClass.getInstance();

        // all 3 ref variables are pointing to  just one object
    }
}
