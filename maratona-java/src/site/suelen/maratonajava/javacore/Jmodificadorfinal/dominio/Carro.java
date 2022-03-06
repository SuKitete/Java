package site.suelen.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    //public final class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();//A referência que a variável COMPRADOR tem para o objeto nunca poderá ser alterada
     /*

    FINAL CLASSES E MÉTODOS
    Tem a ver com o conceito de herança.
    Quando o modificador final é usado na classe essa classe não pode ser estendida
    Quando o modifficador final é usado no método, esse método não pode ser sobrescrito
    */

    public final void imprime(){
    System.out.println(this.nome);
    }

    /*
    FINAL TIPO REFERÊNCIA
    Quando o final é usado com um tipo reference, a referência que a variável tem para o objeto não pode ser modificado, porém, os dados sim
    É muito útil no padrão singleton, pois nesse padrão é utilizado somente uma instância

    FINAL
    Define um valor constante para a variável, também pode ser usado na classe
    Por ser uma constante, a variável deve ser inicializada com o valor desejado
    A convenção é escrever a variável em maiúsculo, se tiver mais de uma palavra usar o _ para separar
    Geralmente a constante é aliada ao modificador estatic

    Outras formas de usar e inicializar a variável constante
    public static final double VELOCIDADE_LIMITE;
    public final double VELOCIDADE_LIMITE;//Sem o static a variável deve ser acessada pela variável de referência

    Bloco estático
    static{
        VELOCIDADE_LIMITE = 250;
    }

    Bloco sem ser estático
    {
        VELOCIDADE_LIMITE = 250;
    }

    Construtor
    public Carro(){
        VELOCIDADE_LIMITE = 250;
    }
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
