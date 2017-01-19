package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Created by minchanglong on 12/17/16.
 */
public class CountItemStream {
    public static void main(String[] args) {

        System.out.println("Creating List");

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            strings.add("Item " + i);
        }

        long count = strings.stream().parallel().count();
        System.out.println("Count " + count);

        TreeSet<String> a = strings.stream().filter(s -> s.equals("-1")).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(a);
    }
}
