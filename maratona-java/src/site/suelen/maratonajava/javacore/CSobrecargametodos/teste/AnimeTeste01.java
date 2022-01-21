package site.suelen.maratonajava.javacore.CSobrecargametodos.teste;

import site.suelen.maratonajava.javacore.CSobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Naruto", "TV", 24, "ação");
        anime.imprime();

    }
}
