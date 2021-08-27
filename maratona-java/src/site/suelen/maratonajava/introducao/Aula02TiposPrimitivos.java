package site.suelen.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /* int, double, float, char, byte, short, long, boolean
        O nome da variavel deve começar com letra minuscula,
        se for nome composto as palavras seguintes iniciam com letra maiuscula
        */
        int idade = 10; //inteiro para numeros menores
        long numeroGrande = 100000; //inteiro para numeros maiores
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractereAscii = 65; //ao colocar um valor numerico em char ele coverte para letra da tabela ASCII
        char caractereUnicode = '\u0042';
        String nome = "Suelen";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(caractereAscii);
        System.out.println(caractereUnicode);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é "+nome);
    }
}
