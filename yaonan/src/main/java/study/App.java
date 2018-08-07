package study;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
