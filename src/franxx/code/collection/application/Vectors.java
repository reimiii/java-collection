package franxx.code.collection.application;

import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        list.add("Hilmi");
        list.add("Akbar");
        list.add("Muharrom");

        for (var v : list) {
            System.out.println(v);
        }
    }
}
