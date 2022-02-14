package site.suelen.maratonajava.javacore.Hheranca.dominio;

/*
HERANÇA
É a extensão das funcionalidades de alguma classe
Em associação utiliza-se o termo "tem", e o acoplamento é mais fraco
Exe: Uma pessoa tem um endereço
Em herança utiliza-se o termo "é", e o acoplamento é muito forte
Exe: um funcionário é uma pessoa
No caso, funcionário é mais especializado e pessoa é mais genérica
Tudo que pessoa tem funcionário tem, ou seja, os atributos e os métodos, porém funcionário tem campos específicos
Para herança utiliza-se a palavra extends entre as duas classes de interesse
É bom evitar o uso de herança, devido ao seu alto acoplamento
Geralmente é usada em dois casos, para estender as funcionalidades de uma classe ou para usar polimorfismo
 */
public class Funcionario extends Pessoa {
    private double salario;

    /*
    Construtor em herança
    Após criar um construtor na classe pai é necessário criar um construtor para a subclasse
    Como a subclasse tem os mesmos campos da classe pai o construtor também será exigido
    Como no método, é necessário usar a palavra super na subclasse para incluir o atributo no construtor
    */
    //public Funcionario(String nome){
      //  super(nome);//super para incluir o atributo da subclasse no construtor
    //}

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }

    /*
    SUPER
    Executa o método da forma que foi descrito na classe pai
     */
    public void imprime(){//Sobrescreve o método da classe pai
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
