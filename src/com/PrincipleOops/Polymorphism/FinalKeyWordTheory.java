package com.PrincipleOops.Polymorphism;

public class FinalKeyWordTheory {

    /*** final ---->>> you cannot  override a method that is final
     * he final keyword can be used with:
     * 1️⃣Variables → value can’t be changed.
     * 2️⃣Methods → can’t be overridden.
     * 3️⃣Classes → can’t be inherited (extended).
     *
     * you cant override a final  method
     * When a method is marked as final, it means:
     *❌No subclass is allowed to modify or override this method’s behavior.
     *✅ Reason: To prevent breaking behavior that the original class author wants to remain consistent.
     *🚫 Can we override final methods?
     * No. That’s a compile-time error
     *
     *✅ Can we override non-final methods in a final class?
     *❌ No. Because you can’t even extend a final class.
     * **/
}

// can t override a final in method
//
//class A{
//    final void show(){
//        System.out.println("I am  overriding a final method");
//    }
//}
//class B extends A {
//    @Override
//    // it will cause a compile time error
//    void show(){
//        System.out.println("You can't override it ");
//    }
//}

// 🛑 Output:  error: show() in B cannot override show() in A
// overridden method is final


// override a non-final method in a final  class cant make a class as final
//final class C {
//    void display(){
//        System.out.println("I am override a  final class");
//    }
//}
//class D extends  C{
//    void display(){
//        System.out.println("You cant override a non final method inside a final class");
//    }
//}

//  🛑 Output: error: cannot inherit from final C
// class D extends C {

