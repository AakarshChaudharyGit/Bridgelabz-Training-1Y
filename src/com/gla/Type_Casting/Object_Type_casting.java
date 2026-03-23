package com.gla.Type_Casting;
class Vehicle{
    void display(){
        System.out.println("Vehicle class");
    }
}
class Maruti extends Vehicle{
    void speed(){
        System.out.println("Car run fast");
    }
}
public class Object_Type_casting {
    public static void main(String[] args){
        Vehicle obj = new Maruti();              // upcasting
        obj.display();
        Maruti m = (Maruti)obj;                  // downcasting
        m.speed();
    }
}
