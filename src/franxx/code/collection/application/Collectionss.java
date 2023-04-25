package franxx.code.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionss {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(List.of("Hilmi", "AM", "002"));

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
