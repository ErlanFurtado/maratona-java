package furtado.erlan.maratonajava.javacore.Gassociacao.test;

import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Jogador;
import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasilian");
        Time time2 = new Time("Argentina");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time2);
        time.setJogadores(jogadores);

        System.out.println("----------- jogador-------");
        jogador.imprime();
        jogador2.imprime();

        System.out.println("----------- Time-------");
        time.imprime();
    }
}
