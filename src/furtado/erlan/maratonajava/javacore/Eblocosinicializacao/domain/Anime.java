package furtado.erlan.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int [] episodios;
    {
        System.out.println("Dentro do bloco inicializacao");
    }

    public Anime() {
        episodios = new int[20];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
        for (int episodios: this.episodios){
            System.out.print(episodios +" ");
        }
    }
}
