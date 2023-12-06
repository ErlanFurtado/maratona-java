package furtado.erlan.maratonajava.javacore.Wnio.test;

import java.nio.file.*;

public class PatheMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        mathces(path1, "glob:*.bkp");
        mathces(path1, "glob:**.bkp");
        mathces(path3, "glob:**/file.????");

    }
    private static void mathces(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+ matcher.matches(path));
    }
}
