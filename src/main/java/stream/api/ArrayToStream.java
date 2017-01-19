package stream.api;

import model.Person;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * Created by minchanglong on 12/17/16.
 */
public class ArrayToStream {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Joe", 48),
                new Person("Mary", 30),
                new Person("Mike", 73),
        };

        Stream<Person> stream = Stream.of(people);
        stream.forEach(System.out::println);

        System.out.println("-------------------------");

        Stream<Person> stream1 = Arrays.stream(people);
        stream1
                .filter(p -> p.getAge() > 25)
                .filter(p -> p.getAge() < 48)
                .forEach(System.out::println);
    }
}
