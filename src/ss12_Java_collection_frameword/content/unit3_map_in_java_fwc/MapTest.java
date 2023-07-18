package ss12_Java_collection_frameword.content.unit3_map_in_java_fwc;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);
        Set<String> keys = customers.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + " : " + customers.get(key));
        }
    }
}
