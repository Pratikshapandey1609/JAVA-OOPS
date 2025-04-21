package com.AbstractionInterface.AbstractClasses.CodeAbstractExample;

public class Main {
    public static void main(String[] args) {
        // Son child class
        Son son = new Son(24);
        son.career();
        son.partner();

        // Daughter child class
        Daughter daughter = new Daughter(21);
        daughter.partner();
        daughter.partner();

        Parent daughter1 = new Daughter(23);
        //daughter1.career();

        Parent.hello();

        // parent class
        // you can't create an object of parent class
        // Parent mom = new Parent();

    }
}
