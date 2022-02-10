package site.suelen.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("O grande program de previsão do futuro");
        System.out.println("Digite sua pergunta e responderei sim ou não");
        String pergunta = entrada.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO ");
        }
    }
}
