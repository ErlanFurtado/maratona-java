package furtado.erlan.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = " eu doarei 500 pro DevDojo";
        String mensagemNaoDoar = "ainda nao tenho condicoes, mais vou ter ";
        String resultado;
        if (salario > 5000){
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
