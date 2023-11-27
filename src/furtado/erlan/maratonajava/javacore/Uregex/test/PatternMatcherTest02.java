package furtado.erlan.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que nao for digito
        // \s = Espaços em branco
        // \S = Todos os caracteres excluindo os brancos
        String regex = "\\s";
       // String texto = "abaaba";
        String texto2 = "abaob abao";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 01234567");
        System.out.println("regex "+regex);
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group()+ "\n");
        }
    }
}
