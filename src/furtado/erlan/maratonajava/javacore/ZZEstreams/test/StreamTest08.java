package furtado.erlan.maratonajava.javacore.ZZEstreams.test;

import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("No game", 2.99),
            new LightNovel("Fullmetal", 5.99),
            new LightNovel("Kumo", 1.99),
            new LightNovel("Monogatari", 4.00))
    );

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price >3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price >3)
                .sum();
    }
}
