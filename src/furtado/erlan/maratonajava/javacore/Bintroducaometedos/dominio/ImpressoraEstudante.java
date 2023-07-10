package furtado.erlan.maratonajava.javacore.Bintroducaometedos.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante){ //Passando Objetos como argumentos, estou passando referencia

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
