package com.Part2OOPs.Packages.StaticExam;

/* outside classes classes which is not insde any other classes
*  can not be static*/
//static class outerClass {   // ❌ ERROR! Top-level class cannot be static
//   static class innerClass {
//     }  // allowed inner class as static
//}

public class InnerClasses {
    // only inner classes can be static here you can put or remove static
    static class Test {
          String name;
          public Test(String name){
              this.name = name;
          }
    }
    public static void main(String[] args) {
        Test a = new Test("pratiksha");
        Test b = new Test("priya");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
