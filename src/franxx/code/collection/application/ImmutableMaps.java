package franxx.code.collection.application;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMaps {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Hilmi");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("Name", "Hilmi");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "genre", "Fantasy",
                "category", "Anime",
                "rating", "8.2"
        );

        map.put("a", "A"); // Error
    }
}
