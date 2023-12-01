package furtado.erlan.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
