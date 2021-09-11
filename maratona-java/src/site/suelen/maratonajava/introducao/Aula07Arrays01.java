package site.suelen.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        /*
        Arrays são referências
        A variável em um array referencia um espaço em memória que pode ter mais de um valor
        Variável em arrays é sempre um tipo reference
        Arrays são considerados objetos, a variável referencia um objeto

        As posições de um array sempre serão inicializadas com um valor padrão
        Se for int = 0
        Se for float = 0.0
        Se for String = null

        Um array por ser uma variável do tipo reference pode ser inicializada com null
        O valor do índice (posição) sempre inicia no 0

        Exemplo -> int [] idades = new int [3]; O 3 é a quantidade de memória que está sendo alocada
        */

        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

    }
}
