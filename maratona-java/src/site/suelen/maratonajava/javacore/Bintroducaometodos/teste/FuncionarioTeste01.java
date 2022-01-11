package site.suelen.maratonajava.javacore.Bintroducaometodos.teste;

import site.suelen.maratonajava.javacore.Bintroducaometodos.dominio.Fucionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Fucionario funcionario = new Fucionario();

        funcionario.setNome("João");
        funcionario.setIdade(35);
        funcionario.setSalarios(new double[]{2000, 4000, 3500});

        funcionario.imprime();
        System.out.println(funcionario.getMedia());
    }
}
