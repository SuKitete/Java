package site.suelen.maratonajava.javacore.introducaoclasses.teste;

import site.suelen.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro(); // 488 Spider 2019
        Carro carro2 = new Carro(); //carro2 X1 2022

        carro1.nome = "Ferrari";
        carro1.modelo = "488 Spider";
        carro1.ano = 2019;

        carro2.nome = "BMW";
        carro2.modelo = "X1";
        carro2.ano = 2022;

        System.out.println("Nome do carro: "+carro1.nome+"\nModelo: "+carro1.modelo+"\nAno: "+carro1.ano);
        System.out.println("\nNome do carro: "+carro2.nome+"\nModelo: "+carro2.modelo+"\nAno: "+carro2.ano);

    }
}
