package furtado.erlan.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriated);

        File fileArquivoDiretorio = new File(fileDiretorio, "aquivoX.txt");
                boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenomeado);

    }
}
