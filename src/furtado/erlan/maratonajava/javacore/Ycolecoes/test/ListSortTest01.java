package furtado.erlan.maratonajava.javacore.Ycolecoes.test;

import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Beserk");
        mangas.add("Attack on titan");
        mangas.add("Pokemon");
        mangas.add("Naruto");
        mangas.add("Dragon ball");

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);

        }
    }
}
