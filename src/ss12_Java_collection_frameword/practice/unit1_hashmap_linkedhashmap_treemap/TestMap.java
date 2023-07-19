package ss12_Java_collection_frameword.practice.unit1_hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        // Duyệt qua từng Entry của hashMap
        for (String key : hashMap.keySet()) {
            System.out.println(key + "-" + hashMap.get(key));
        }

        Map<String, Integer> treeMap = new TreeMap<>(hashMap); // Ép kiểu hashMap sang TreeMap
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        // Duyệt qua từng Entry của hashMap
        for (String key : treeMap.keySet()) {
            System.out.println(key + "-" + treeMap.get(key));
        }

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap);
        // Duyệt qua từng Entry của hashMap
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + "-" + linkedHashMap.get(key));
        }
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
