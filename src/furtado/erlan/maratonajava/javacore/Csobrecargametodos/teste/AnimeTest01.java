package furtado.erlan.maratonajava.javacore.Csobrecargametodos.teste;

import furtado.erlan.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama", "TV", 12, "Ação");
        //anime.setNome("Akudama Drive");
        //anime.setTipo("TV");
        //anime.setEpisodios(12);
        anime.imprime();
    }
}
