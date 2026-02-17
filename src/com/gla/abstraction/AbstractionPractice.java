package com.gla.abstraction;

abstract class Fruit{
    abstract void test();
    public void color(){
        System.out.println("Yellow");
    }
}

class Mango extends Fruit{

    @Override
    void test() {
        System.out.println("Sweet");
    }
}

class  Pineapple extends Fruit{

    @Override
    void test() {
        System.out.println("Taste is Sweet");
    }
}

class Kiwi extends Fruit{

    @Override
    void test() {
        System.out.println("Taste is Bitter");
    }
}


public class AbstractionPractice {
    public static void main(String[] args) {
        Mango m1 = new Mango();
        m1.test();
        m1.color();
        Fruit f1 = new Mango();
        f1.color();
        f1.test();
        Fruit f2 = new Pineapple();
        f2.test();
    }
}
