package site.suelen.maratonajava.javacore.Hheranca.teste;

import site.suelen.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class FuncionarioTeste01 extends Pessoa{

    public FuncionarioTeste01(String nome){
        super(nome);
    }

    public void imprime(){
        this.nome = "sasa";
    }
    /*
    PROTECTED
    Se for uma subclasse consegue acessar os atributos como se fosse público em qualquer lugar
    Porém, se não for uma subclasse só pode acessar os atributos estando dentro do mesmo pacote
    No caso, o atributo nome está protected
     */

}
