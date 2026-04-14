package com.gla.collections;

import java.util.HashMap;

public class HashmapExample {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("OM", 14);
        map.put("Chirag", 67);
        map.put("Mayank", 33);
        map.put("Chirag", 47);
        System.out.println(map);
        System.out.println(map.get("OM"));
        System.out.println(map.containsKey("OM"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
