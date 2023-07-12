package furtado.erlan.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int [] episodios;
    {
        System.out.println("Dentro do bloco inicializacao");
    }

    public Anime() {
        episodios = new int[20];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
        for (int episodios: Anime.episodios){
            System.out.print(episodios +" ");
        }
    }
}
