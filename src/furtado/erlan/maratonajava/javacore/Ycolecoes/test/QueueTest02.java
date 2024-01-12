package furtado.erlan.maratonajava.javacore.Ycolecoes.test;
import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaByIdComparator().reversed());
        mangas.add(new Manga(5L, "Naruto", 19));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on titan", 11.20));
        mangas.add(new Manga(2L, "Dragon ball", 2.99));
        mangas.add(new Manga(10L, "Aaragon", 2.99));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
