package franxx.code.collection.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("Darling");
        names.add("In");
        names.add("The");
        names.add("FranXX");

        names.add("Darling");
        names.add("In");
        names.add("The");
        names.add("FranXX");

        for (var v : names) {
            System.out.println(v);
        }

    }
}
