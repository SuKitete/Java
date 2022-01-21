package site.suelen.maratonajava.javacore.Dconstrutores.teste;

import site.suelen.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
        public static void main(String[] args) {

            Anime anime = new Anime("Naruto", "TV", 24, "ação", "Production IG");
            Anime anime2 = new Anime();
            anime.imprime();

        }
}
