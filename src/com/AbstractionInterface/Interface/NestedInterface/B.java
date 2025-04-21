package com.AbstractionInterface.Interface.NestedInterface;

public class B implements A.NestedInterface{

    @java.lang.Override
    public boolean isOdd(int num) {
        return ( num & 1 ) == 1 ;
    }
}