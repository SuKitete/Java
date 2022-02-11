package site.suelen.maratonajava.javacore.Gassociacao.teste;

import site.suelen.maratonajava.javacore.Gassociacao.dominio.Aluno;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Local;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Professor2;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Seminario;

/*
Crie um sistema que gerencie seminários

O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado

Um aluno poderá estar em apenas um seminário
Um seminário poderá ter nenhum ou vários alunos
Um professor poderá ministrar vários seminários
Um seminário deve ter um local

Capos básicos(excluindo relacionamentos)
seminário: título
aluno: nome e idade
professor: nome e especialidade
local: endereço
 */

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Turing");
        Aluno aluno = new Aluno("João", 15);
        Professor2 professor = new Professor2("Lucas", "Desenvolvedor");

        Aluno[] alunos = {aluno};

        Seminario seminario1 = new Seminario("Programação Para Jogos", local, alunos);

        Seminario[] seminarios = {seminario1};

        professor.setSeminarios(seminarios);

        professor.imprime();

    }
}
