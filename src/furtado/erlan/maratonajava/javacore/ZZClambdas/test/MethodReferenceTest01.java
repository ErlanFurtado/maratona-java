package furtado.erlan.maratonajava.javacore.ZZClambdas.test;

import furtado.erlan.maratonajava.javacore.ZZClambdas.dominio.Anime;
import furtado.erlan.maratonajava.javacore.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Beserk", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500)));
       // Collections.sort(animeList, (a1, a2)-> a1.getTitle().compareTo(a2.getTitle()));
       // Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareEpisodes);
        System.out.println(animeList);
    }
}