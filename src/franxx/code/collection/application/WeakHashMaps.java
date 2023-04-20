package franxx.code.collection.application;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new WeakHashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, i);
        }

        System.gc();

        System.out.println(map.size());
    }
}
