package furtado.erlan.maratonajava.javacore.Gassociacao.test;

import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Aluno;
import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Local;
import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Professor;
import furtado.erlan.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua tres");
        Aluno aluno = new Aluno("Jose ", 20);
        Professor professor = new Professor("Barba branca ", "pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("One ", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
