package site.suelen.maratonajava.javacore.Gassociacao.teste;

import site.suelen.maratonajava.javacore.Gassociacao.dominio.Jogador;
import site.suelen.maratonajava.javacore.Gassociacao.dominio.Time;

//Associação bidirecional
public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---Time---");

        time.imprime();

        System.out.println("\n---Jogadores---");

        jogador1.imprime();

        System.out.println("-------------");

        jogador2.imprime();



    }
}
