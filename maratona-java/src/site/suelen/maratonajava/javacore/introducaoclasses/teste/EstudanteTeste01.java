package site.suelen.maratonajava.javacore.introducaoclasses.teste;

import site.suelen.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 27;
        estudante.matricula = 2141;
        estudante.nome = "Suelen";

        System.out.println(estudante.idade);
        System.out.println(estudante.matricula);
        System.out.println(estudante.nome);


    }
}
