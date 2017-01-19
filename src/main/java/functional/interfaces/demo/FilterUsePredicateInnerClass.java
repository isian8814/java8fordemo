package functional.interfaces.demo;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by minchanglong on 12/17/16.
 */
public class FilterUsePredicateInnerClass {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));


//        Predicate<Person> perd = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return (person.getAge() >= 65);
//            }
//        };

        Predicate<Person> perdOlder = (p) -> p.getAge() >= 65;
        Predicate<Person> predYounger = (p) -> p.getAge() <= 40;

        //displayPeople(people, perdOlder);
        displayPeople(people, predYounger);
    }

    private static void displayPeople(List<Person> people, Predicate<Person> perdOlder) {
        people.forEach(person -> {
            if (perdOlder.test(person)) {
                System.out.println(person.toString());
            }
        });

        people.stream().filter(perdOlder).forEach(person -> {
            System.out.println(person.toString());
        });
        System.out.println(people);
    }
}
