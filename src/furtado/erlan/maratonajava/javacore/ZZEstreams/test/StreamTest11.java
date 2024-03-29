package furtado.erlan.maratonajava.javacore.ZZEstreams.test;

import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("No game", 2.99),
            new LightNovel("Fullmetal", 5.99),
            new LightNovel("Kumo", 1.99),
            new LightNovel("Monogatari", 4.00))
    );
    public static void main(String[] args) {
        System.out.println((long) lightNovels.size());
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());

        DoubleSummaryStatistics collect = lightNovels.stream().collect((Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);

    }
}
