package furtado.erlan.maratonajava.javacore.Aintroclasses.teste;

import furtado.erlan.maratonajava.javacore.Aintroclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre";
        professor.idade = 21;
        professor.sexo = 'M';

        System.out.println(professor.nome + " idade " + professor.idade + " sexo " + professor.sexo);
    }
}
