package date.time.demo;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by minchanglong on 12/17/16.
 */
public class DateAndTimes {

    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();

        Thread.sleep(1000);

        Instant end = Instant.now();

        Duration elapsed = Duration.between(start, end);

        System.out.println("Elapsed: " + elapsed.toMillis());
    }
}
