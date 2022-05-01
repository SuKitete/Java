package site.suelen.maratonajava.javacore.Lclassesabstratas.dominio;

/*
CLASSE ABSTRATA
Fica proibida de ser estanciada
Apenas as classe que estendem dela podem ser estanciadas
 */
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this. nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    /*
    MÉTODO ABSTRATO
    Usado quando é necessário obrigar todas as subclasses a proverem a implementação de um método
    Em uma classe abstrata pode existir tanto método abstrato quanto concreto, porém, em uma
    classe concreta não pode existir métodos abstratos
    Um método abstrato não possui corpo
     */
    public abstract void calculaBonus();
}
