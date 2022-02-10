package site.suelen.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    /*
    MODIFICADOR DE ACESSO ESTÁTICO
    Faz com que o atributo pertença a classe
    e todos os objetos compartilhem o mesmo valor
    Se for alterado apenas uma instância, na verdade será alterado todos os objetos da classe correspondente
     */

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(Carro.velocidadeLimite);
    }

    /*
    MÉTODO ESTÁTICO
    As boas práticas dizem que um método estático pode ser usado quando ele
    não acessa nenhum atributo da instância
     */
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
}
