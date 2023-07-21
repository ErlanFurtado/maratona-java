package furtado.erlan.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private String marca;
    private TipoCliente tipoCliente;


    public Cliente(String nome, TipoCliente tipoCliente, String marca) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", marca='" + marca + '\'' +
                '}';

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


}
