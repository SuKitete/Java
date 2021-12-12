package site.suelen.maratonajava.javacore.Aintroducaoclasses.teste;

import site.suelen.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;
//Ao criar o objeto é preciso importar(import) a classe referente a esse objeto

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();//A variável é do tipo estudante e o objeto é do tipo estudante
        estudante.idade = 27;                 //Para criar um novo objeto é necessário usar
        estudante.nome = "Suelen";            //a palavra new e o objeto que deseja criar
        estudante.sexo = 'F';

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);


    }
}
