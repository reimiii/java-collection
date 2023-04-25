package franxx.code.collection.application;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMaps {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Zero", "Zero");
        map.put("Two", "Two");
        map.put("FranXX", "FranXX");

        for (var k : map.keySet()) {
            System.out.println(k);
        }

        System.out.println(map.lowerKey("Two"));
        System.out.println(map.higherKey("Two"));

        System.out.println("==================");

        NavigableMap<String, String> navigableMap = map.descendingMap();

        for (var v : navigableMap.keySet()) {
            System.out.println(v);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(navigableMap);

        immutable.put("002", "002"); /// ERROR
    }
}
