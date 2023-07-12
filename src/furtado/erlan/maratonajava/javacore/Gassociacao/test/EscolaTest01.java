package furtado.erlan.maratonajava.javacore.Gassociacao.test;

import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Escola;
import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya ");
        Professor [] professores = {professor};
        Escola escola = new Escola("Konoha", professores);
        escola.imprime();
    }
}
