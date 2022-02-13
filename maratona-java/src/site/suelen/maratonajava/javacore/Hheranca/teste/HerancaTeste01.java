package site.suelen.maratonajava.javacore.Hheranca.teste;

import site.suelen.maratonajava.javacore.Hheranca.dominio.Endereco;
import site.suelen.maratonajava.javacore.Hheranca.dominio.Funcionario;
import site.suelen.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Laranjeiras");
        endereco.setCep("123456");
        Pessoa pessoa = new Pessoa("João");
        pessoa.setNome("Renato");
        pessoa.setCpf("2445342-42");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Pedro", "123456789");
        funcionario.setNome("Alan");
        funcionario.setCpf("373827-33");
        funcionario.setSalario(8000);
        funcionario.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("---------------");
        funcionario.imprime();

    }
}
