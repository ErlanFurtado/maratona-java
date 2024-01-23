package furtado.erlan.maratonajava.javacore.ZZDoptional.test;

import furtado.erlan.maratonajava.javacore.ZZDoptional.dominio.Manga;
import furtado.erlan.maratonajava.javacore.ZZDoptional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepositorio.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no hero2"));
        System.out.println(mangaByTitle);

       Manga mangaById = MangaRepositorio.findById(String.valueOf(2)).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);
    }
}
