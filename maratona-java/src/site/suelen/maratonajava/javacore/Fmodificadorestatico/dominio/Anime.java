package site.suelen.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*
    BLOCO DE INICIALIZAÇÃO ESTÁTICO
    Executa o bloco de inicialização apenas uma vez
    Basta adicionar a palavra static

    ORDEM
    0 - Bloco de inicialização é executado quando a JVM carregar a classe
    1 - Alocado espaço em memória para o obejto
    2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    3 - O bloco de inicialização é executado
    4 - O construtor é executado
     */

    static {
        System.out.println("Dentro do bloco de inicialização 1");
        episodios = new int[100];
        for(int i = 0; i<episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(){
        for(int episodio: episodios){
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
        return episodios;
        }
}
