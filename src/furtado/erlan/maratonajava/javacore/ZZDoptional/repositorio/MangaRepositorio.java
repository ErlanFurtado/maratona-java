package furtado.erlan.maratonajava.javacore.ZZDoptional.repositorio;

import furtado.erlan.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static List<Manga> mangas = List.of(new Manga(1,"Boku no hero", 50), new Manga(2,"Overlord", 60));

    public static Optional<Manga> findByTitle(String title){
       return findBy(manga -> manga.getTitle().equals(title));
        }

    public static Optional<Manga> findById(String id){
        return findBy(manga -> manga.getId().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas){
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
