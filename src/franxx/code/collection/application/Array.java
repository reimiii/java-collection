package franxx.code.collection.application;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<String> names = List.of("002", "Zero", "Two");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
