package franxx.code.collection.application;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethod {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Mee", "e Value");
        map.put("Pee", "p Value");
        map.put("Qee", "q Value");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });
    }
}
