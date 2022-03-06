package site.suelen.maratonajava.javacore.Kenum.teste;

import site.suelen.maratonajava.javacore.Kenum.dominio.Cliente;
import site.suelen.maratonajava.javacore.Kenum.dominio.TipoCliente;

import static site.suelen.maratonajava.javacore.Kenum.dominio.Cliente.*;

public class ClienteTeste01 {
    public static void main(String[] args) {
                                                    //Enum
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Paulo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Gustavo", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Lucas",TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
