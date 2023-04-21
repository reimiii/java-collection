package franxx.code.collection.application;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMaps {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Hilmi");
        map.put(key2, "Hilmi");

        System.out.println(map.size());
    }
}
