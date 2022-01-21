package site.suelen.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        this.episodios = new int[100];
        for(int i = 0; i<this.episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(){
        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
            }
        System.out.println();
        }

        public Anime(String nome){
        this.nome = nome;
        }

        public String getNome(){
        return this.nome;
        }

        public int[] getEpisodios(){
        return this.episodios;
        }
}
