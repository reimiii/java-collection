package franxx.code.collection.application;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMaps {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);

        map.put(Level.STANDARD, "Hilmi");
        map.put(Level.PREMIUM, "Akbar");
        map.put(Level.VIP, "Muharrom");

        for (var v : map.keySet()) {
            System.out.println(map.get(v));
        }
    }
}
