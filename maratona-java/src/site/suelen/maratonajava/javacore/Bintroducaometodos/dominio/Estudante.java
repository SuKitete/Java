package site.suelen.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    /*
    USO DO THIS
    O this é usado para se referir a algo que está dentro do objeto
    Quando o método está dentro do objeto ele acessa todos os atributos desse objeto
     */
    public void imprime (){
        System.out.println(this.nome);//Quando não existe outra variável local não é necessário o this,
        System.out.println(this.idade);//porém é importante utilizar para informar o uso da variável da classe
        System.out.println(this.sexo);
    }
}
