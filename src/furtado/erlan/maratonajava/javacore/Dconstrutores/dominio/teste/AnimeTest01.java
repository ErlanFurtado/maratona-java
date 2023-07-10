package furtado.erlan.maratonajava.javacore.Dconstrutores.dominio.teste;


import furtado.erlan.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 12, "Acao");
        anime.imprime();
        Anime anime2 = new Anime();
        anime2.imprime();
    }
}
