package com.gla.generics;
import java.util.ArrayList;
class Box2<T> {
    private T item;
    public Box2(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void setItem(T item) {   // corrected method name
        this.item = item;
    }
}
public class Ex_1 {
    public static void main(String[] args) {   // main must be public
        Box2<Integer> obj = new Box2<>(10);   // value required

        System.out.println(obj.getItem());

        obj.setItem(20);
        System.out.println(obj.getItem());
    }
}
