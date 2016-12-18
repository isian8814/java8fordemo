package functional.interfaces.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by minchanglong on 12/17/16.
 */
public class UserBuildInComaprator {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

        //Simple case-sensitive sort operation
        Collections.sort(strings);
        System.out.println("Simple sort");
        for(String str: strings){
            System.out.println(str);
        }

        //Case-insensitive sort with an anonymous class
        Comparator<String> comp = (str1, str2) -> str2.compareToIgnoreCase(str1);

        strings.sort(comp);
        System.out.println("Sort with comparator");
        for(String str: strings){
            System.out.println(str);
        }
    }
}
