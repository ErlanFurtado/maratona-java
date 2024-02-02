package furtado.erlan.maratonajava.javacore.ZZEstreams.test;

import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.Category;
import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("No game", 2.99, Category.DRAMA),
            new LightNovel("Fullmetal", 5.99, Category.FANTASY),
            new LightNovel("Kumo", 1.99, Category.ROMANCE),
            new LightNovel("Monogatari", 4.00, Category.DRAMA))
    );

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors
                .maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

    }
}
