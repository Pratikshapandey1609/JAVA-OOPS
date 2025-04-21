package com.AbstractionInterface.Interface.CodeInterfaceExample;

public class Main {
    public static void main(String[] args) {

        // making a Car class objects
        Car car = new Car();

        // here calling a methods
        car.brake();
        car.start();
        car.stop();
        car.acc();


        //Using a reference  type  Engine you are only able to access which is inside Engine
        Engine car1 = new Car();
//        car1.a;
//        car1.brake();

        Media carMedia = new Car();
        carMedia.stop();  // output of it  which occur issue
                          // "I am able to Accelerator / fast up the car"

        NiceCar car2 = new NiceCar();
        car2.start();
        car2.stop();
    }
}
