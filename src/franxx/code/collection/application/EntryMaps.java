package franxx.code.collection.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMaps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("N", "n");
        map.put("I", "i");
        map.put("G", "g");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var v : entries) {
            System.out.println(v.getKey() + " : " + v.getValue());
        }
    }
}
