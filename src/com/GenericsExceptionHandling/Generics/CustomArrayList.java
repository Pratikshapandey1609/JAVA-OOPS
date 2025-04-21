package com.GenericsExceptionHandling.Generics;

import java.util.ArrayList;

public class CustomArrayList {

    private int [] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also work as index

    public CustomArrayList(){
          this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
       int [] temp = new int[data.length * 2];

       for(int i = 0; i < data.length; i++){
           temp[i] = data[i];
       }
       data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public  int remove(){
//        int removed = data[--size];
//        return removed;

        return data[--size];
    }

    // these are some custom arraylist which java provides to us
    //        list = new ArrayList();
    //        list.add(1 , 6789);
    //        list.remove(0);
    //        list.set(1 , 7653);
    //        list.size();

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(7);
        list.add(34);

        System.out.println(list);

    }
}
