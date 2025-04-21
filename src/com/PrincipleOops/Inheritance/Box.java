package com.PrincipleOops.Inheritance;

public class Box {
    double l ;
    double h;
    double w;

    // constructors
    // default one
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube single argument constructor
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    // perameterized
    Box ( double l ,double h , double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    // copy
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("this is box running ");
    }
}
