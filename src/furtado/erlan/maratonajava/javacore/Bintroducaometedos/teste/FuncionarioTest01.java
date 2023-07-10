package furtado.erlan.maratonajava.javacore.Bintroducaometedos.teste;

import furtado.erlan.maratonajava.javacore.Bintroducaometedos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Erlan";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();

    }
}
