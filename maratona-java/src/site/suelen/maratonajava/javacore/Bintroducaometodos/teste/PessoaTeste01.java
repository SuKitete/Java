package site.suelen.maratonajava.javacore.Bintroducaometodos.teste;

import site.suelen.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        //pessoa.nome = "João"; Desta forma não funciona pois não é possível acessar atributo no modo private
        pessoa.setNome("João");//Para que funcione deve ser chamado pelo método
        pessoa.setIdade(50);

        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
