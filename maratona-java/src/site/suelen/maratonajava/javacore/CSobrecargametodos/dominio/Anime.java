package site.suelen.maratonajava.javacore.CSobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;



    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    /*
    SOBRECARGA DE MÉTODOS
    É quando existe mais de um método com o mesmo nome
    porém o tipo ou quantidade dos parâmetros são diferentes
    */

    public void init(String nome, String tipo, int espisodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = espisodios;
    }

    public void init(String nome, String tipo, int espisodios, String genero){
        init(nome, tipo, espisodios);
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

}
