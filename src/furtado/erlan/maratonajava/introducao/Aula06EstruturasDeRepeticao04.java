package furtado.erlan.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado

    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal/parcela;
            if(valorParcela >=1000){
                System.out.println("parcela "+ parcela+ " R$ "+ valorParcela);
            }
            System.out.println("Fora do if, mas dentro do for "+parcela );
        }
    }
}
