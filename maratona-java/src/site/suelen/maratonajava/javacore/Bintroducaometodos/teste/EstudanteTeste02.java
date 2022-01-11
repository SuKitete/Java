package site.suelen.maratonajava.javacore.Bintroducaometodos.teste;

import site.suelen.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Ana";
        estudante01.idade = 20;
        estudante01.sexo = 'F';

        estudante02.nome = "Arthur";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
