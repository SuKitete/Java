package site.suelen.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() { //void executa mas não tem retorno

        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
            System.out.println(21 - 2);
        }

        /*
        Passando parâmetros
        Parâmetros são variáveis locais
         */
    public void multiplicaDoisNumeros(int num1, int num2) {//É necessário determinar as
            System.out.println(num1 * num2);               //variáveis com o tipo primitivo
        }                                                  //É possível usar tipos primitivos diferentes
}
