package furtado.erlan.maratonajava.javacore.ZZClambdas.dominio.service;

import furtado.erlan.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int compareEpisodesNonStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
