package furtado.erlan.maratonajava.javacore.Bintroducaometedos.teste;

import furtado.erlan.maratonajava.javacore.Bintroducaometedos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisnumeros(10, 2);
        System.out.println(result);
        System.out.println("------------------------------------");
        calculadora.imprimeDivisaoDoisNumeros(86,2);

    }
}
