package furtado.erlan.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Erlan"; //String constant pool
        String nome2 = "Erlan";
        System.out.println(nome == nome2);
        nome.concat("Furtado ");
    }
    // RESUMO AULA
    //Strings sao imultaveis
    // nao colocar muita coisa dentro de uma string
}
