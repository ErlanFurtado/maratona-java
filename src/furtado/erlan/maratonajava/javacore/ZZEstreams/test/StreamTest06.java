package furtado.erlan.maratonajava.javacore.ZZEstreams.test;

import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("No game", 2.99),
            new LightNovel("Fullmetal", 5.99),
            new LightNovel("Kumo", 1.99),
            new LightNovel("Monogatari", 4.00))
    );
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice()>8));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice()>0));
        lightNovels.stream()
                .filter(ln-> ln.getPrice()>3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(lightNovel -> lightNovel.getPrice()>3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
