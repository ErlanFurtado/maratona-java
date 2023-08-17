package furtado.erlan.maratonajava.javacore.Oexception.runtime.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class TryWithResourcesTest01     {
    public static void main(String[] args) {

    }
    public static void lerArquivo(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
