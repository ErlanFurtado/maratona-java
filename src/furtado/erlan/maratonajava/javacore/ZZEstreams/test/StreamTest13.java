package furtado.erlan.maratonajava.javacore.ZZEstreams.test;

import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.Category;
import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import furtado.erlan.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("No game", 2.99, Category.DRAMA),
            new LightNovel("Fullmetal", 5.99, Category.FANTASY),
            new LightNovel("Kumo", 1.99, Category.ROMANCE),
            new LightNovel("Monogatari", 4.00, Category.DRAMA))
    );

    public static void main(String[] args) {
        Map<Object, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));
        System.out.println(collect);
    }
}
