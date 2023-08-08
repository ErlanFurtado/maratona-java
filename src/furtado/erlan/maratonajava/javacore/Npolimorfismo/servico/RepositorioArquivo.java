package furtado.erlan.maratonajava.javacore.Npolimorfismo.servico;

import furtado.erlan.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
