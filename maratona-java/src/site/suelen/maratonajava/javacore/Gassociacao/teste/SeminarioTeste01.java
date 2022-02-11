package site.suelen.maratonajava.javacore.Gassociacao.teste;

import site.suelen.maratonajava.javacore.Gassociacao.dominio.Aluno;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Local;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Professor2;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua Turing");
        Local local2 = new Local("Rua Pacheco");
        Seminario seminario1 = new Seminario("Programação Para Jogos", local1);
        Seminario seminario2 = new Seminario("Banco de Dados", local2);
        Seminario seminario3 = new Seminario("LGPD", local1);
        Aluno aluno1 = new Aluno("João", 15);
        Aluno aluno2 = new Aluno("Rodrigo", 16);
        Aluno aluno3 = new Aluno("Davi", 17);
        Professor2 professor1 = new Professor2("Lucas", "Desenvolvedor");
        Professor2 professor2 = new Professor2("Rafael", "Tester");


        seminario1.setAlunos(new Aluno[]{aluno1});
        seminario2.setAlunos(new Aluno[]{aluno2});
        seminario3.setAlunos(new Aluno[]{aluno3});
        seminario1.setProfessor(professor1);
        seminario2.setProfessor(professor1);
        seminario3.setProfessor(professor2);

        professor1.setSeminarios(new Seminario[]{seminario1, seminario2});
        professor2.setSeminarios(new Seminario[]{seminario3});

        seminario1.imprime();
        System.out.println("\n-----------------------------------------------\n");
        seminario2.imprime();
        System.out.println("\n-----------------------------------------------\n");
        seminario3.imprime();
        System.out.println("\n-----------------------------------------------\n");
        professor1.imprime();
        System.out.println("\n-----------------------------------------------\n");
        professor2.imprime();
    }
}
