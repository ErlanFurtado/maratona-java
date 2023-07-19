package furtado.erlan.maratonajava.javacore.Jmodificadorfinal.test;

import furtado.erlan.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import furtado.erlan.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01    {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("K2");
        ferrari.imprime();
    }
}
