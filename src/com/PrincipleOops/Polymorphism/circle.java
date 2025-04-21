package com.PrincipleOops.Polymorphism;


public class circle extends Shapes{
    @Override  // this is called Annotation if you want to check method  is overridden or not
              // use @override just use for check purpose if method is overridden or not nothing else

        // ohk so here child class method override the parent class
        // when you are creating an object of child class this will run bcoz  the object of this class gives priority to his own class first
        // hence it   override the parent class methods........

    void Area(){
        System.out.println("I am in circle extend shapes");
    }

    // this method is not overridden hence its giving error
//    void Areaaaaaaa(){
//        System.out.println("I am in circle extend shapes");
//    }

}
