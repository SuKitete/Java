package site.suelen.maratonajava.javacore.Jmodificadorfinal.teste;

import site.suelen.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Não é aconselhável acessar a variável constante pela variável de referência
        //O correto é acessar pela classe
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
