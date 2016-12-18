package method.reference.demo;

import model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchanglong on 12/17/16.
 */
public class StaticMethodReference {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        people.sort(Person::compareAges); //compareAges is static method reference
        people.forEach(System.out::println);
    }
}
