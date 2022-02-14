package site.suelen.maratonajava.javacore.Isobrescrita.dominio;

public class Anime extends Object {
    private String nome;

    /*
    toString
    Todas as classes são objetos porque elas são subclasses do Object
    O Object possui o método toString, responsável por imprimir
    Por causa da regra da herança ele sempre é executado na variável
    de referência e pode ser sobrescrito nas outras classes
     */

    /*
    Regras para sobrescrever
    O nome precisa ser o mesmo
    A quantidade precisa ser a mesma, independente de ter ou não parâmetros
    O tipo de retorno tem que ser a classe ou a subclasse
    O modificador de acesso não pode ser mais restritivo, public é modificador de acesso mais aberto
     */
    @Override//@Override garante que está sobrescrevendo o método toString, caso aconteça um erro de escrita não criar um método
    public String toString() {
        return "Anime: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
