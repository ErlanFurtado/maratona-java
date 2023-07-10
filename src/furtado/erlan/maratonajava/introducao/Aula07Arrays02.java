package furtado.erlan.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int ,long ,float e double 0

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Gou";
        nomes[2] = "Gu";
       // nomes[3] = "Naruto";

        for (int i = 0; i <nomes.length ; i++) {
            System.out.println(nomes[i]);

        }
    }
}
