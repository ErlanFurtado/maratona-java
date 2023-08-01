package furtado.erlan.maratonajava.javacore.Lclassesabstratas.test;

import furtado.erlan.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import furtado.erlan.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import furtado.erlan.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("R7", 5000);
        Desenvolvedor dev = new Desenvolvedor("Marc", 2000);
        System.out.println(gerente);
        System.out.println(dev);
    }
}
