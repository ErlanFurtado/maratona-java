package furtado.erlan.maratonajava.javacore.Ycolecoes.test;

import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Erlan Furtado");
        Consumidor consumidor2 = new Consumidor("DevDojo ");

        NavigableMap<String, String>map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println(map.headMap("C", true));
        System.out.println();
    }
}
