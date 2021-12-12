package site.suelen.maratonajava.javacore.Aintroducaoclasses.teste;

import site.suelen.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        /*
        Ao imprimir sem atribuir nenhum valor será impresso o valor de iniciação padrão

        Também é possível adicionar valor direto na classe, porém todos os objetos seguintes
        terão o mesmo valor, a não ser que determine um outro valor no método main
        */
    }
}
