package site.suelen.maratonajava.javacore.Bintroducaometodos.teste;

import site.suelen.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import site.suelen.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprime = new ImpressoraEstudante();

        estudante01.nome = "Ana";
        estudante01.idade = 20;
        estudante01.sexo = 'F';

        estudante02.nome = "Arthur";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        imprime.impressora(estudante01);

        imprime.impressora(estudante02);

        System.out.println("----------");

        imprime.impressora2(estudante01);

        imprime.impressora2(estudante02);

        System.out.println("#########");

        imprime.impressora2(estudante01);

        imprime.impressora2(estudante02);

    }
}
