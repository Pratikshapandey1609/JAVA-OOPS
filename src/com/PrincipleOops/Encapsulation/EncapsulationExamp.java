package com.PrincipleOops.Encapsulation;

public class EncapsulationExamp {

    /*➡️ What is Encapsulation in Java
     * Encapsulation in java is process of Wrapping the data(Variable) and methods(functions) i
     * into a single unit (class) and restricting access to them from outside.
      📌  This is done using:
        ➡️  private variables
        ➡️  public getters and setters

     * Encapsulation is process of containing the informations
     * **/

    public static void main(String[] args) {
        Student stu = new Student();

        stu.setAge(21);
        stu.setName("pratiksha pandey");

        System.out.println("Name is : " + stu.getName());
        System.out.println("Age  is : " + stu.getAge());
    }
}

class Student {
    private String name;
    private int age;

    // getter for name
    public String getName(){
        return name;
    }
    // setter for name
    public void setName(String  name){
        this.name = name;
    }

    // getter for age
    public int getAge(){
        return  age;
    }
    // setter for age
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

}