package furtado.erlan.maratonajava.javacore.Hherança.Test;

import furtado.erlan.maratonajava.javacore.Hherança.dominio.Endereço;
import furtado.erlan.maratonajava.javacore.Hherança.dominio.Funcionario;
import furtado.erlan.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerançaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Rua 2");
        endereço.setCep("1099387");
        Pessoa pessoa = new Pessoa("Joao");
        pessoa.setCpf("98731238");
        pessoa.setEndereço(endereço);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario(" Naruto ");
        funcionario.setCpf(" 232344");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(2000);
        System.out.println("--------------------");
        funcionario.imprime();
    }
}
