package franxx.code.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Immutables {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu Saja");
        List<String> empty = Collections.emptyList();

        System.out.println(one);
        System.out.println(empty);

        List<String> mutable = new ArrayList<>();
        mutable.add("Gw 1");
        mutable.add("Gw 2");
        List<String> imutable = Collections.unmodifiableList(mutable);

        List<String> list = List.of("Eko", "Budi", "Anduk");
    }
}
