package franxx.code.collection.application;

import java.util.Iterator;
import java.util.List;

public class Iterables {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Hilmi", "Akbar", "Muharrom");

        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
