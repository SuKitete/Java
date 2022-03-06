package site.suelen.maratonajava.javacore.Jmodificadorfinal.teste;

import site.suelen.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import site.suelen.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import site.suelen.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Não é aconselhável acessar a variável constante pela variável de referência
        //O correto é acessar pela classe
        System.out.println(Carro.VELOCIDADE_LIMITE);
        Comprador comprador2 = new Comprador();
        //carro.COMPRADOR = comprador2; Não é possível fazer desta forma pois não pode trocar a referência
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
