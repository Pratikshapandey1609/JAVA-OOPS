package com.PrincipleOops.Polymorphism;

public class EarlyLateBinding {
    /*
    * binding means --> connecting a method call to its method body
    *🔴 1. Early Binding (Static Binding)
        Based On Reference type
       ✅ Happens at: Compile Time
       ✅ java Uses early binding in : Method Overloading or calls to private, static, and final methods
       ✅ The method signatures are resolved during compilation,
           so this is early binding.

    *🔴 2. Late Binding (Dynamic Binding)
         Based On Actual object type
         ✅ Happens at: Runtime
         ✅ Uses: Method Overriding (Polymorphism)
         ✅ Here, Java doesn’t know at compile time which method to call — it depends on the object type at runtime
    * */

    public static void main(String[] args) {

        // 🔴 1. Early Binding (Static Binding)
        Calculator calc = new  Calculator();
        calc.add(5 , 7);  // Compiler binds to add(int, int)
        calc.add(2 , 6 , 9);  // Compiler binds to add(int, int , int)

        // 🔴 2. Late Binding (Static Binding)
        Animal obj  = new Dog();  // Upcasting
        obj.sound(); // Runtime decides to call Dog's version → Late Binding
    }
}

// 🔴  Early Binding (Static Binding)
class  Calculator{
    void add(int a , int b){
        System.out.println("Sum :" + (a +b));
    }
    void add(int a , int b , int c){
        System.out.println("Sum :" + (a + b + c));
    }
}

// 🔴 Late  Binding (dynamic  Binding)

class Animal {
  void sound(){
      System.out.println("Animals sounds");
  }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark !! ");
    }
}