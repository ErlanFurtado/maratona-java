package furtado.erlan.maratonajava.javacore.Kenum.test;

import furtado.erlan.maratonajava.javacore.Kenum.dominio.Cliente;
import furtado.erlan.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("kakashi", TipoCliente.PESSOA_FISICA, "Ferrari");
        Cliente cliente2 = new Cliente("kakashi", TipoCliente.PESSOA_FISICA,"Audi");
        Cliente cliente3 = new Cliente("kakashi", TipoCliente.PESSOA_FISICA,"Onix");
        Cliente cliente4 = new Cliente("kakashi", TipoCliente.PESSOA_JURIDICA, "Toro");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
