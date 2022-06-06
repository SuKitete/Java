package site.suelen.maratonajava.javacore.Lclassesabstratas.teste;

import site.suelen.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import site.suelen.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Paulo", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
