package com.AbstractionInterface.Interface.CodeInterfaceExample;

public class NiceCar {
    private Engine engine;

    public NiceCar(){
        // whatever engine is written in this engine that corresponding method is running
        engine = new PowerEngine();
       // engine = new ElectricEngine();

    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }
}
