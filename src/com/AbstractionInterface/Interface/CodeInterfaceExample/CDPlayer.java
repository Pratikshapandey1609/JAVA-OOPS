package com.AbstractionInterface.Interface.CodeInterfaceExample;

// here for Media interface is making a separate a class for it
public class CDPlayer implements Media{

    @java.lang.Override
    public void start() {
        System.out.println("Music is Start");
    }

    @java.lang.Override
    public void stop() {
        System.out.println("Music is Stop");
    }

    public static void main(String[] args) {
        // main method only for media and cdplayer

        CDPlayer cdp = new CDPlayer();

        cdp.start();
        cdp.stop();
    }
}
