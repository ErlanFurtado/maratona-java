package furtado.erlan.maratonajava.javacore.Ycolecoes.test;

import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6 );
        mangas.add(new Manga (5L, "Naruto",19));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L, "Attack on titan", 11.20));
        mangas.add(new Manga(2L,"Dragon ball", 2.99));
        System.out.println(mangas);
    }
}
