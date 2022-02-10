package site.suelen.maratonajava.javacore.Gassociacao.teste;

import site.suelen.maratonajava.javacore.Gassociacao.dominio.Escola;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Professor;

//Associação unidirecional muitos para um
public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Pedro");
        Professor professor2 = new Professor("Paulo");
        Professor[] professores = {professor1, professor2};
        //Escola escola = new Escola("ABC");
        Escola escola = new Escola("ABC", professores);
        //escola.setProfessores(professores);
        escola.imprime();

    }
}
