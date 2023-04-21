package franxx.code.collection.application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMaps {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Hilmi");
        map.put("middle", "Akbar");
        map.put("last", "Muharrom");

        Set<String> keys = map.keySet();
        for (var v : keys) {
            System.out.println(v);
        }

    }
}
