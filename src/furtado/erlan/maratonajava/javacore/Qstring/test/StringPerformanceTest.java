package furtado.erlan.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        Long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String foi de: " + (fim - inicio) + " ms ");

         inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuilder foi de: " + (fim - inicio) + " ms ");
    }
    private static void concatString (int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho ; i++) {
            texto +=i;
        }
    }
    private static void concatStringBuilder (int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho ; i++) {
            sb.append(i);
        }
    }
}
