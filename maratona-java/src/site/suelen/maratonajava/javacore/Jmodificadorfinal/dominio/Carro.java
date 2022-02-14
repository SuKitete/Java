package site.suelen.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    /*
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
