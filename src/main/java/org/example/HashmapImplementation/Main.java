package org.example.HashmapImplementation;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMapCustom map = new HashMapCustom(5, 0.75);
        map.put(1,"hello");
        map.put(2,"friend");
        map.put(10,"Elliot");
        map.put(5,"hello");
        System.out.println(map.capacity());
        map.put(6,"friend");
        map.put(7,"Elliot");

        map.put("absh", 699);

        System.out.println(map.get(10));
        System.out.println(map.get(2));
        System.out.println(map.get(1));

        System.out.println(map.get(10000));

        System.out.println(map.capacity());
        System.out.println(map.get("absh"));
    }
}
