package site.suelen.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        /*
        A variável em um array referencia um espaço em memória que pode ter mais de um valor
        Variável do lado esquerdo é do tipo reference, do lado direito é um objeto
        Arrays são considerados objetos
        Um array por ser uma variável do tipo reference pode ser inicializada com null
        O valor do índice (posição) sempre inicia pelo 0
        */

        //Exemplo de array
        int[] idades = new int[3];//O 3 é a quantidade de memória que está sendo alocada
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

    }
}
