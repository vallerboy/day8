package classextended;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Damian", "Kolodziej", 24);
        Person person2 = new Person("Damian", "Kolodziej", 24);
        Person person1 = new Person("Kacper", "Kowalczyk", 32);


        Set<Person> set = new HashSet<>();
        set.add(person);
        set.add(person2);
        set.add(person1);

        System.out.println(0b1000);
    }
}
