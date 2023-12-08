package furtado.erlan.maratonajava.javacore.Ycolecoes.test;

import furtado.erlan.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1abc", "iphone");
        Smartphone s2 = new Smartphone("222", "google");
        Smartphone s3 = new Smartphone("333", "samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("222", "google");

        System.out.println(smartphones.contains(s4));
        int indexSmartphones = smartphones.indexOf(s4);


    }
}
