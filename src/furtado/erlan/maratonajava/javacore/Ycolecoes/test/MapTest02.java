package furtado.erlan.maratonajava.javacore.Ycolecoes.test;

import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Erlan Furtado");
        Consumidor consumidor2 = new Consumidor("DevDojo ");


        Manga manga1 = new Manga(5L, "Naruto", 19);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon ball", 2.99);
        Map<Consumidor, Manga> consumidorManga = new  HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet());
        System.out.println();

        System.out.println(consumidor1);
    }
}
