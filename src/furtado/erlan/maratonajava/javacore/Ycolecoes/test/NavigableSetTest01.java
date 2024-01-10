package furtado.erlan.maratonajava.javacore.Ycolecoes.test;

import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Manga;
import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        //  NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Naruto", 19));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on titan", 11.20));
        mangas.add(new Manga(2L, "Dragon ball", 2.99));
        mangas.add(new Manga(10L, "Aaragon", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu", 8, 5);
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println("-------------------");
        System.out.println(mangas.floor(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

    }
}
