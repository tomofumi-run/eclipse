package practice;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Day {
  public static void main(String[] args) {
    LocalDateTime d = LocalDateTime.now();
    // LocalDateTime d = LocalDateTime.of(2016, 1, 1, 10, 10, 10);
    // LocalDateTime d = LocalDateTime.parse("2016-01-01T10:10:10");

    System.out.println(d.getYear());
    System.out.println(d.getMonth());
    System.out.println(d.getMonth().getValue());
    System.out.println(d); //now
    System.out.println(d.plusMonths(2).minusDays(3));

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!");
    System.out.println(d.format(dtf));

  }

}