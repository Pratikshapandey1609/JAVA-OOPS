package com.AccessControl.access;

public class A {

    int age; // default one package-private  accessible only in same package
    private int num; // access only in same class
    public String name; // access anywhere you want
    protected String MotherName; // access  only in same class and same packages only

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public A(int age , int num , String name,  String MotherName){
        this.age = age;
        this.num = num;
        this.name = name;
        this.MotherName = MotherName;
       // this.arr = new int[10];
    }
}
