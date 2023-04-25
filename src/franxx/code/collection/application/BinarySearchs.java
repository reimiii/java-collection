package franxx.code.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchs {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }

        int index = Collections.binarySearch(list, 554);
        System.out.println(index);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int i = Collections.binarySearch(list, 514);

        System.out.println(i);
    }
}
