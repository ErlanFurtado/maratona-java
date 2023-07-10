package furtado.erlan.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
            int n1 = 10;
            int n2 = 20;
            int resultado = n1 * n2;
        System.out.println(resultado);

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinda = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinda = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinda "+isDentroDaLeiMaiorQueTrinda);
        System.out.println("isDentroDaLeiMenorQueTrinda "+isDentroDaLeiMenorQueTrinda);
        System.out.println("");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
        System.out.println("");

        int contador = 0;
        contador ++;
        contador ++;
        System.out.println(contador);
    }
}
