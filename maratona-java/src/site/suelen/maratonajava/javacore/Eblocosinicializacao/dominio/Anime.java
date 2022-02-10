package site.suelen.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    /*
    BLOCO DE INICIALIZAÇÃO
    É executado toda vez que um objeto é criado

    ORDEM
    1 - Alocado espaço em memória para o obejto
    2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    3 - O bloco de inicialização é executado
    4 - O construtor é executado
     */
    {
        this.episodios = new int[100];
        for(int i = 0; i<this.episodios.length; i++) {//Este é um bloco de inicialização
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
