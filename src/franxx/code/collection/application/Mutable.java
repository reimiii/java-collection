package franxx.code.collection.application;

import franxx.code.collection.data.Person;

import java.util.List;

public class Mutable {
    public static void main(String[] args) {
        Person person = new Person("Hilmi");

        person.addHobby("Baca Manga");
        person.addHobby("Beat the Meat");

        doSomethingWithHobby(person.getHobbies());

        for (var v : person.getHobbies()){
            System.out.println(v);
        }
    }

    public static void doSomethingWithHobby(List<String> hobby){
        hobby.add("Eat Kebab");
    }
}
