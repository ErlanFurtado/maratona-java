package furtado.erlan.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);

    }

    public void relatorioPagamento(){
        System.out.println(" Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;

    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
