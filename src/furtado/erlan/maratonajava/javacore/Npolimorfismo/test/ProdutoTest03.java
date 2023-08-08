package furtado.erlan.maratonajava.javacore.Npolimorfismo.test;

import furtado.erlan.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import furtado.erlan.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import furtado.erlan.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import furtado.erlan.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 5", 2500);

        Tomate tomate = new Tomate("papaia", 20);
        tomate.setDataValidade("11/11/2011");

        CalculadoraImposto.calcularImposto(tomate);

    }
}
