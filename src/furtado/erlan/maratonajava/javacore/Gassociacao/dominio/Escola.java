package furtado.erlan.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(Professor[] professores) {
        this.professores = professores;
    }

    public Escola(String konoha, Professor[] professores) {
    }

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null)
            return;
        for (Professor professore : professores) {
            System.out.println(professore.getNome());

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public void Professor(String nome) {
        this.nome = nome;
    }
}
