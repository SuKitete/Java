package site.suelen.maratonajava.javacore.Bintroducaometodos.teste;

import site.suelen.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String... args) {

        Calculadora calculadora = new Calculadora();

        int [] numeros = {1,2,3,4};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(10,1,2,3,4);

    }
}
