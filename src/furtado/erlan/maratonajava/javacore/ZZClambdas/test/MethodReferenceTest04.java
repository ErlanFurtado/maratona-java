package furtado.erlan.maratonajava.javacore.ZZClambdas.test;

import furtado.erlan.maratonajava.javacore.ZZClambdas.dominio.Anime;
import furtado.erlan.maratonajava.javacore.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Beserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareEpisodesNonStatic);
    }
}
