package site.suelen.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void impressora (Estudante estudante){

        System.out.println("-------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
