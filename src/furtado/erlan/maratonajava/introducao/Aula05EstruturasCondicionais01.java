package furtado.erlan.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoComprar = idade >=18;

        if (isAutorizadoComprar) {
            System.out.println("autorizado a comprar ");
        }else {
            System.out.println("Não autorizado a comprar ");
        }

    }
}
