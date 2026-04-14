package com.gla.collections;

import java.util.*;

public class Priority_queue {
    public static void main(String[] args) {

        // Max Heap (reverse order)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements
        pq.offer(34);
        pq.offer(12);
        pq.offer(56);
        pq.offer(8);

        // Display queue
        System.out.println("Priority Queue: " + pq);

        // Peek (top element)
        System.out.println("Top element: " + pq.peek());

        // Remove elements
        System.out.println("Removed: " + pq.poll());
        System.out.println("After removal: " + pq);

        // Size
        System.out.println("Size: " + pq.size());

        // Check empty
        System.out.println("Is empty? " + pq.isEmpty());
    }
}
