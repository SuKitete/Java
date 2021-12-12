package site.suelen.maratonajava.javacore.Aintroducaoclasses.teste;

import site.suelen.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

/*
As classes devem ter alta coesão, ou seja, cada uma deve ter um
propósito específico, representar apenas um objeto do mundo real.
Por exemplo, professor não deve estar junto com estudante, por isso foi criada uma classe nova
*/

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + ", idade: " + professor.idade + ", sexo: " + professor.sexo);

    }

}
