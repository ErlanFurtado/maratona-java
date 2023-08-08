package furtado.erlan.maratonajava.javacore.Npolimorfismo.test;

import furtado.erlan.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import furtado.erlan.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import furtado.erlan.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
