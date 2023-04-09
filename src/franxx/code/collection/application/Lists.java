package franxx.code.collection.application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> namess = new LinkedList<>();

        names.add("Zero Two");
        names.add("Franxx Code");

        System.out.println(names.get(0));
        System.out.println(names.get(1));

        names.set(0, "002");

        names.remove(1);

        System.out.println(" ");
        for (var v : names) {
            System.out.println(v);
        }

    }
}
