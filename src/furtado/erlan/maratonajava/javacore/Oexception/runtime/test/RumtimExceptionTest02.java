package furtado.erlan.maratonajava.javacore.Oexception.runtime.test;

public class RumtimExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
    }
    private static int divisao (int a, int b ){
        if(b == 0){
            throw new RuntimeException("Argumento invalido");
        }
        return a/b;
    }
}
