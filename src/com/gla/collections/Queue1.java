package com.gla.collections;
import java.util.*;
public class Queue1 {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(56);
        q.offer(77);
        q.offer(654);

        System.out.println(q.peek());
        System.out.println(q.element());

        q.remove(77);
        q.poll();
        System.out.println(q);
    }
}
