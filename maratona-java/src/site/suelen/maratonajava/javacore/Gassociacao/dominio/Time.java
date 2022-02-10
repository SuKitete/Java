package site.suelen.maratonajava.javacore.Gassociacao.dominio;

//Classe time criada para ser associada ao jogador
public class Time {
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
