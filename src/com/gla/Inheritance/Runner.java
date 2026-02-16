package com.gla.Inheritance;

public class Runner {
    static void main(){
        Dog d1 = new Dog();
        d1.sound();
        d1.walks();
        System.out.println("---------------------------------------------------------------------------");
        Puppy p1 = new Puppy();
        p1.look();
        p1.walks();
        p1.sound();
        System.out.println("---------------------------------------------------------------------------");
        Animal a1 = new Animal();
        a1.walks();
    }
}
