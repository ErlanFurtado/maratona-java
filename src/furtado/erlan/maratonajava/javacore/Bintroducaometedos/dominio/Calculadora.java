package furtado.erlan.maratonajava.javacore.Bintroducaometedos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideDoisnumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma+= num;
        }
        System.out.println(soma);
    }
}
