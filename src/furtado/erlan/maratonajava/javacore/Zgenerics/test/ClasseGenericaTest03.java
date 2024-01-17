package furtado.erlan.maratonajava.javacore.Zgenerics.test;

import furtado.erlan.maratonajava.javacore.Zgenerics.dominio.Barco;
import furtado.erlan.maratonajava.javacore.Zgenerics.dominio.Carro;
import furtado.erlan.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
       // RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
      //  Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        //System.out.println("Usando o carro por um mes ...");
        //rentalServiceCarro.retornarObjetoAlugado(carro);

    }
}
