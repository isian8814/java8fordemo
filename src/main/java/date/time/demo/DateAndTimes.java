package date.time.demo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

/**
 * Created by minchanglong on 12/17/16.
 */
public class DateAndTimes {

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        Instant start = Instant.now();

        Thread.sleep(1000);

        Instant end = Instant.now();

        Duration elapsed = Duration.between(start, end);

        System.out.println("Elapsed: " + elapsed.toMillis());

        String time = "2014-10-10T16:13:00.000Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(time);
        System.out.println(offsetDateTime.getDayOfYear());
        System.out.println(offsetDateTime.getMonth().getValue());
        System.out.println(offsetDateTime.getDayOfMonth());
        System.out.println(offsetDateTime.getHour());
        System.out.println(offsetDateTime.toInstant().toEpochMilli());

        long a = -2974000;
        double b = a / 20000.00;
        System.out.println(b);

    }
}
