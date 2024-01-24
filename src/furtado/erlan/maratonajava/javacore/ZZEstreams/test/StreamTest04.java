package furtado.erlan.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDessigners = List.of("Erlan", "Vitoria", "Eduardo");
        List<String> developers = List.of("Joao", "Jose", "Maioro");
        List<String> students = List.of("Antonio", "Jea", "Nil");
        devdojo.add(graphicDessigners);
        devdojo.add(developers);
        devdojo.add(students);
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);

            }

        }
        System.out.println("----------------");
            devdojo.stream()
                    .flatMap(Collection::stream ).forEach(System.out::println);
    }
}
