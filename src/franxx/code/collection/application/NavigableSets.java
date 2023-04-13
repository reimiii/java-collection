package franxx.code.collection.application;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSets {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>(Set.of("Hilmi", "Akbar", "Muharrom", "Arief", "Karditya"));

        NavigableSet<String> nameRe = names.descendingSet();
        NavigableSet<String> hilmi = names.headSet("Muharrom", true);

        for (var name : hilmi) {
            System.out.println(name);
        }
    }
}
