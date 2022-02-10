package site.suelen.maratonajava.javacore.Gassociacao.teste;

import site.suelen.maratonajava.javacore.Gassociacao.dominio.Jogador;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Time;

//ASSOCIAÇÃO UNIDIRECIONAL UM PARA MUITOS
public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador.setTime(time);//Associando o jogador ao time

        jogador.imprime();
    }
}
