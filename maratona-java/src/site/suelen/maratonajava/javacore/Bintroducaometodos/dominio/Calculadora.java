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
    public void multiplicaDoisNumeros(int num1, float num2) {//É necessário determinar as
            System.out.println(num1 * num2);               //variáveis com o tipo primitivo
        }                                                  //É possível usar tipos primitivos diferentes


    public double divideDoisNumeros(double num1, double num2){//Método com retorno
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por 0");
            return;//No void o return funciona como um break, impedindo que continue a execução
        }
            System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro de alteraDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int [] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(double valor, int... numeros){//Varargs, outra forma de representar arrays
        int soma = 0;                                     //Outra forma de passar vários elementos
        for(int num: numeros){                            //do mesmo tipo para um método
            soma += num;
        }
        System.out.println(soma+valor);
    }
}
