package site.suelen.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*
        OPERADORES ARITMÉTICOS
        +, -, *, /
        */
        int numero01 = 10;
        double numero02 = 20;
        double soma = numero01 + numero02;
        double subtracao = numero01 - numero02;
        double divisao = numero01 / numero02;
        double multiplicacao = numero01 * numero02;
        /*
        se o cálculo for entre dois números do tipo int, por exemplo, o resultado também será int,
        ao menos uma das variáveis envolvidas no cálculo deve ser do tipo que se deseja obter o valor
        */
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);
        /*
        Toda soma que estiver após uma string será considerada como
        concatenação, e a soma que estiver antes será considerada como operação
        */
        System.out.println(numero01+numero02+"Valor "+numero01+numero02);
//-----------------------------------------------------------------------------------------------------------
        // % RESTO DA DIVISÃO

        int resto = 21 % 2;
        System.out.println(resto);
//-----------------------------------------------------------------------------------------------------------
        /*
        OPERADORES RELACIONAIS
        sempre retorna um valor boleano
        < (menor) |  > (maior) | <= (menor ou igual) | >= (maior ou igual) | == (igual) | !=(diferente)
        */
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
//-----------------------------------------------------------------------------------------------------------
        /*
        OPERADORES LÓGICOS
        && (and) || (or) ! (not)
 ------------------------------------------------------------------------------------------------------------
        && (and)
         */
        int idade = 29;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);
/*-------------------------------------------------------------------------------------------------------------
        || (or)
        */
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
//-------------------------------------------------------------------------------------------------------------------------------------
        /*
        OPERADORES DE ATRIBUIÇÃO
        = += -= *= /= %=
        Usado para abreviar o código
        bonus = bonus + 1000; é o mesmo que bonus += 1000;
         */
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // UNARIO ++ --
        int contador = 0;
        contador += 1; // contador = contador +1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 2;
        System.out.println(contador2++); // colocando ++ depois primeiro ele executa a ação e depois incrementa
        System.out.println(contador2);   // o mesmo vale para o --
        System.out.println(++contador2); // colocando ++ antes primeiro ele incrementa e depois ele executa
    }
}
