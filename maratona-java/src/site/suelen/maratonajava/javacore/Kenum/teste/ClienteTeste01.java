package site.suelen.maratonajava.javacore.Kenum.teste;

import site.suelen.maratonajava.javacore.Kenum.dominio.Cliente;
import site.suelen.maratonajava.javacore.Kenum.dominio.TipoCliente;
import site.suelen.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
                                                    //Enum
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Paulo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.TipoClientePorNomeRelatorio("Pessoa Física");//Buscando o tipo da enumeração pelo atributo
        System.out.println(tipoCliente2);

    }
}
