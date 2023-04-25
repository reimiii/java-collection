package franxx.code.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(
                List.of("Hilmi", "AM")
        );

        Collections.sort(list);

//        for (var v : list) {
//            System.out.println(v);
//        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, comparator);

        for (var v : list) {
            System.out.println(v);
        }
    }
}
