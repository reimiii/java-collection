package franxx.code.collection.application;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class ShortedMaps {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Hilmi", "Hilmi");
        sortedMap.put("Akbar", "Akbar");
        sortedMap.put("Muharrom", "Muharrom");

        for (var v : sortedMap.keySet()) {
            System.out.println(v);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        immutable.put("Two", "Two"); /// Error
    }
}
