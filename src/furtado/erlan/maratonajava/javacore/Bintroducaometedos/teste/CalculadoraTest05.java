package furtado.erlan.maratonajava.javacore.Bintroducaometedos.teste;

import furtado.erlan.maratonajava.javacore.Bintroducaometedos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
    }
}
