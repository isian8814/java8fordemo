package stream.api;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by minchanglong on 12/17/16.
 */
public class SequentialAndParallelStream {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Predicate<Person> pred = (p) -> p.getAge() > 65;

        displayPeople(people, pred);
    }

    private static void displayPeople(List<Person> people, Predicate<Person> predicate) {
        //run sequential processing
        people.stream()
                .filter(predicate)
                .forEach(person -> System.out.println(person.getName()));

        //run parallel processing
        people.stream()
                .parallel() //specify parallel
                .filter(predicate)
                .forEach(person -> System.out.println(person.getName()));
    }
}
