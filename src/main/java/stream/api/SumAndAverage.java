package stream.api;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * Created by minchanglong on 12/17/16.
 */
public class SumAndAverage {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        int sum = people.stream()
                .mapToInt(Person::getAge)
                .sum();

        System.out.println("Total Ages: " + sum);

        OptionalDouble avg = people.stream()
                .mapToInt(Person::getAge)
                .average();

        if (avg.isPresent()) {
            System.out.println("Average " + avg.getAsDouble());
        } else {
            System.out.println("Average not calculated");
        }
    }
}
