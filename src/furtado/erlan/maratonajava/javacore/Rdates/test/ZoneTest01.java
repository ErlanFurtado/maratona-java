package furtado.erlan.maratonajava.javacore.Rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(ZoneId.systemDefault());
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        //ZonedDateTime zonedDateTime2 = nowInstant.atZone();
        //System.out.println(zonedDateTime2);


    }
}
