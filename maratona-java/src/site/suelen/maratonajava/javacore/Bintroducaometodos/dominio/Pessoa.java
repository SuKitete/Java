package site.suelen.maratonajava.javacore.Bintroducaometodos.dominio;

/*
Modificador de acesso
ACOPLAMENTO - GET - SET
Acoplamento é quanto uma classe conhece da outra
Um código com alto acoplamento é ruim
 */

public class Pessoa {
    private String nome;//private os atributos só são acessados dentro do objeto
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {//Set permite armazenar valor no atributo private
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {//Get permite a leitura de um atributo private
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}




