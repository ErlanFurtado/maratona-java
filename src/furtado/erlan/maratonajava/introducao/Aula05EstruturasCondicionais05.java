package furtado.erlan.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo
        byte dia = 5;
        //carh, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo ");
                break;
            case 2:
                System.out.println("seg ");
                break;
            case 3:
                System.out.println("ter ");
                break;
            case 4:
                System.out.println("quar ");
                break;
            case 5:
                System.out.println("qui ");
                break;
            case 6:
                System.out.println("sex ");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            case 'H':
                System.out.println("Homem");
                break;
            case 'M':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }

}
