package franxx.code.collection.application;

import franxx.code.collection.data.Person;
import franxx.code.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Azkia"));
        people.add(new Person("Tuco"));
        people.add(new Person("White"));
        people.add(new Person("Saul"));

        for (var v : people) {
            System.out.println(v.getName());
        }

        SortedSet<Person> personSortedSet = Collections.unmodifiableSortedSet(people);
        personSortedSet.add(new Person("MIggers"));
    }
}
