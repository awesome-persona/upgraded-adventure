package lesson22;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class Main2 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        Month month = localDateTime.getMonth();
        boolean leapYear = localDate.isLeapYear();
        LocalDate localDate1 = localDate.plusMonths(5);
        localDate.plus(5, ChronoUnit.MONTHS);

        LocalDate localDate2 = LocalDate.of(2024, Month.AUGUST, 12);
        LocalDateTime localDateTime1 = LocalDateTime
                .of(2023, 12, 12, 22, 33, 33, 123456789);

        LocalDateTime ny2025 = LocalDateTime.of(2025, Month.JANUARY, 1, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        Duration between = Duration.between(now, ny2025);

        System.out.println(between);

        Period between1 = Period.between(now.toLocalDate(), ny2025.toLocalDate());
        System.out.println(between1);
        Duration between2 = Duration.between(now.toLocalTime(), ny2025.toLocalTime()).plusDays(1);
        System.out.println(between2);

        TemporalAdjuster next = TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY);

        LocalDate with = localDate.with(next);
        System.out.println(with);

    }
}
