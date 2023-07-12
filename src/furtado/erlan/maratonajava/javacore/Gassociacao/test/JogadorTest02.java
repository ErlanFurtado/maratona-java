package furtado.erlan.maratonajava.javacore.Gassociacao.test;

import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Jogador;
import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Selecao");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
