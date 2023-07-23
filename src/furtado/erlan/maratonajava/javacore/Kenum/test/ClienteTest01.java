package furtado.erlan.maratonajava.javacore.Kenum.test;

import furtado.erlan.maratonajava.javacore.Kenum.dominio.Cliente;
import furtado.erlan.maratonajava.javacore.Kenum.dominio.TipoCliente;
import furtado.erlan.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(" kakashi ", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente(" Naruto ", TipoCliente.PESSOA_JURIDICA, TipoPagamento.Credito);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(1000));
        System.out.println(TipoPagamento.Credito.calcularDesconto(1000));
    }
}
