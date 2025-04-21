package com.AbstractionInterface.Interface.CodeInterfaceExample;

public interface Engine {
    // any variable in interface is by default static and final
      static int PRICE =  90000;
      final  int PAY   = 50000;

    // interface contains by default abstract methods,
    void start();
    void stop();
    void acc();

}
