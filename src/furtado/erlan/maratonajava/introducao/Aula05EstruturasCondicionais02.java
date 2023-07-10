package furtado.erlan.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria ifantil
        // idadde >= 15 && <18 juvena
        // idade >=18 categoria adulto

        int idade = 19;

        if (idade <18){
            System.out.println("categiria infantil " );
        } else if (idade >15 && idade <=17) {
            System.out.println("categoria juvenil ");
        }else {
            System.out.println("categoria adulto");
        }
    }
}
