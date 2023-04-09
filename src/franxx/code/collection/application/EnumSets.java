package franxx.code.collection.application;

import java.util.EnumSet;

public class EnumSets {
    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
//        EnumSet<Gender> set = EnumSet.allOf(Gender.class);
        EnumSet<Gender> set = EnumSet.of(Gender.MALE, Gender.FEMALE);

        for (var v : set) {
            System.out.println(v);
        }
    }
}
