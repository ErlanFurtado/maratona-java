package furtado.erlan.maratonajava.javacore.Aintroclasses.teste;

import furtado.erlan.maratonajava.javacore.Aintroclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Corola";
        carro.modelo = "CorolaMaster";
        carro.ano = 2022;

        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " ano: " + carro.ano);
    }
}
