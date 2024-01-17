package furtado.erlan.maratonajava.javacore.Zgenerics.service;

import furtado.erlan.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public T buscarObjetoDisponivel() {
        this.objetosDisponiveis = objetosDisponiveis;
        System.out.println("Buscando objeto disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto " + t);
        System.out.println("Objetos disponiveis para alugar");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar ");
        System.out.println(objetosDisponiveis);
    }
}
