package com.prottonne.pattern.util;

import java.time.LocalDateTime;
import java.security.SecureRandom;

/**
 *
 * @author jose
 */
public class Utils {

    private Utils() {
    }

    public static int createRandomIntBetween(int start, int end) {
        SecureRandom random = new SecureRandom();
        return start + random.nextInt((end - start + 1));
    }

    public static LocalDateTime createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 27);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        int hour = createRandomIntBetween(0, 23);
        int minute = createRandomIntBetween(0, 59);
        return LocalDateTime.of(year, month, day, hour, minute);
    }

    public static boolean isBetween(LocalDateTime date, LocalDateTime from, LocalDateTime to) {
        return date.isAfter(from) && date.isBefore(to);
    }

}
