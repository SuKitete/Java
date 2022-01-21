package site.suelen.maratonajava.javacore.Eblocosinicializacao.teste;

import site.suelen.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime("One Piece");

        System.out.println(anime.getNome());

        for(int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
