package furtado.erlan.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
         //   boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("path "+ file.getPath());
            System.out.println("path absolute "+ file.getAbsolutePath());
            System.out.println("is directory "+file.isDirectory());
            System.out.println("is file "+file.isFile());
            System.out.println("is hidden "+file.isHidden());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
