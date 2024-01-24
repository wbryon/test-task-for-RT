package org.example.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);

        System.out.println(countNumberOfElements(list).entrySet());
    }

    public static Map<Integer,Integer> countNumberOfElements(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        list.forEach(integer -> map.put(integer, map.getOrDefault(integer, 0) + 1));
        return map;
    }
}