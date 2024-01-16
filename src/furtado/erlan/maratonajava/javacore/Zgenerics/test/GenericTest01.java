package furtado.erlan.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;
import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
public class GenericTest01 {
    public static void main(String[] args) {
        // Type arasure
        List<String> lista = new ArrayList();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Midoriya"));

        for (Object o :  lista){
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);

    }
}
