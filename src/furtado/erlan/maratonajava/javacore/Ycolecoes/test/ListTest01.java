package furtado.erlan.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Erlan");
        nomes.add("DevDojo");
        nomes2.add("Furtado");
        nomes2.add("Academy");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("----------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
