package furtado.erlan.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,30,12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour() +" hora");
        System.out.println(time.getMinute() +" minuto");
        System.out.println(time.getSecond() +" segundo");
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
