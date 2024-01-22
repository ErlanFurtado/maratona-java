package furtado.erlan.maratonajava.javacore.ZZClambdas.test;

import furtado.erlan.maratonajava.javacore.ZZClambdas.dominio.Anime;
import furtado.erlan.maratonajava.javacore.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk",20)));
        animeList.sort((a1,a2)-> animeComparators.compareEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
