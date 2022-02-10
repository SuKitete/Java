package site.suelen.maratonajava.javacore.Gassociacao.dominio;

//Classe professor criada para ser associada a escola
public class Professor {
    private String nome;

    public Professor(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
