package furtado.erlan.maratonajava.javacore.Zgenerics.test;

import furtado.erlan.maratonajava.javacore.Zgenerics.dominio.Barco;
import furtado.erlan.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService BarcoRentavelService = new BarcoRentavelService();
        Barco barco = BarcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mes ...");
        BarcoRentavelService.retornarBarcoAlugado(barco);

    }
}
