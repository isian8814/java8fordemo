package functional.interfaces.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by minchanglong on 12/17/16.
 */
public class TraverseCollectionsWithLambda {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

        Comparator<String> comp1 = (str1, str2) -> str2.compareToIgnoreCase(str1);
        Collections.sort(strings, comp1);
        System.out.println("Simple sort");

        // Traverse with for:each
//        for(String str: strings){
//            System.out.println(str);
//        }
        strings.forEach(str -> System.out.println(str));

        Comparator<String> comp = String::compareToIgnoreCase;
        Collections.sort(strings, comp);

        System.out.println("Sort with comparator");

        //Traverse with iterator
//        Iterator<String> i = strings.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }
        strings.forEach(System.out::println);
    }
}
