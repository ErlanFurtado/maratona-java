package furtado.erlan.maratonajava.javacore.Npolimorfismo.test;

import furtado.erlan.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import furtado.erlan.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import furtado.erlan.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Mac2", 10000);
        Tomate tomate = new Tomate("Pequeno tom", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
