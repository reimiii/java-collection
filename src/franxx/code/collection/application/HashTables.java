package franxx.code.collection.application;

import java.util.Hashtable;
import java.util.Map;

public class HashTables {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("f", "Lix");
        map.put("m", "Xea");
        map.put("v", "Bma");

        for (var v : map.keySet()) {
            System.out.println(v);
        }
    }
}
