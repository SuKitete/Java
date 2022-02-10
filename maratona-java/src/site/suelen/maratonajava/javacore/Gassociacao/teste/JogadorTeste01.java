package site.suelen.maratonajava.javacore.Gassociacao.teste;

import site.suelen.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        //Entender o array com objetos é importante para entender o conceito de associação
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for(Jogador jogador: jogadores){
            jogador.imprime();
        }
    }

}
