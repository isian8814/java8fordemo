package stream.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchanglong on 12/17/16.
 */
public class ParallelStream {
    public static void main(String[] args) {

        System.out.println("Creating List");

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            strings.add("Item " + i);
        }

        strings.stream()
                .parallel()
                .forEach(System.out::println);
    }
}
