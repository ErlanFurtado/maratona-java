package furtado.erlan.maratonajava.javacore.Bintroducaometedos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    public void imprime(){
        System.out.printf(this.nome);
        System.out.printf(String.valueOf(this.idade));
        System.out.printf(String.valueOf(this.sexo));
    }
}
