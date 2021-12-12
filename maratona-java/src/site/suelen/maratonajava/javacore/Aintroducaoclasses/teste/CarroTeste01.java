package site.suelen.maratonajava.javacore.Aintroducaoclasses.teste;

import site.suelen.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ferrari";
        carro1.modelo = "488 Spider";
        carro1.ano = 2019;

        carro2.nome = "BMW";
        carro2.modelo = "X1";
        carro2.ano = 2022;

        carro1 = carro2;
        /*
        É possível referenciar um objeto desta forma
        Ao executar, os dois objetos eles terão os mesmos valores
        O primeiro objeto fica perdido em memória
        Só pode ser feito com objeto do mesmo tipo
        */

        System.out.println("Nome do carro: "+carro1.nome+"\nModelo: "+carro1.modelo+"\nAno: "+carro1.ano);
        System.out.println("\nNome do carro: "+carro2.nome+"\nModelo: "+carro2.modelo+"\nAno: "+carro2.ano);

    }
}
