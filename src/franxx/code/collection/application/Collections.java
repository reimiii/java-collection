package franxx.code.collection.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Zero");
        collection.add("Two");
        collection.addAll(List.of("Franxx", "Code"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");
        System.out.println("======");

        collection.remove("Zero");
        collection.removeAll(List.of("Franxx", "Code"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Two")
        );

        System.out.println(
                collection.containsAll(List.of("Franxx", "Code"))
        );

        System.out.println(
                collection.size()
        );
    }
}
