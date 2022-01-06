package site.suelen.maratonajava.javacore.Bintroducaometodos.teste;

import site.suelen.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);

        System.out.println(calculadora.divideDoisNumeros02(10, 2));

        calculadora.imprimeDivisaoDeDoisNumeros(20, 0);
    }
}
