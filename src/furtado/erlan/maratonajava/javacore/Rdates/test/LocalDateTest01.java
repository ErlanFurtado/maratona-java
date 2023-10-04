package furtado.erlan.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        LocalDate date = LocalDate.of(2023, Month.JANUARY,20);
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth()); // Para saber até que dia vai o mês
        System.out.println(date);
    }
}
