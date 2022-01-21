package site.suelen.maratonajava.javacore.Fmodificadorestatico.teste;

import site.suelen.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        /*
        Carro carro = new Carro("BMW", 180);
        Carro carro2 = new Carro("Audi", 200);
        Carro carro3 = new Carro("Mercedes", 230);

        carro.imprime();
        carro2.imprime();
        carro3.imprime();
        */

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite);
    }

}
