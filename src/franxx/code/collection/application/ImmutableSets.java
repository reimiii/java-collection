package franxx.code.collection.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSets {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> single = Collections.singleton("Darling In The FranXX");

        Set<String> mutable = new HashSet<>();
        mutable.add("Zero");
        mutable.add("Two");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        for (var m : immutable) {
            System.out.println(m);
        }

        Set<String> set = Set.of("Darling", "In", "The", "FranXX");

//        set.add("gw"); ERROR
//        set.remove("In"); ERROR

        for (var s : set) {
            System.out.println(s);
        }
    }
}
