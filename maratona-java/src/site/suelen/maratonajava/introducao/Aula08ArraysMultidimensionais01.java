package site.suelen.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
    /*
    ARRAYS MULTIDIMENSIONAIS
    São arrays de arrays
    Eles são linkados, e dessa forma é possível navegar por todas as suas posições
    Exemplo -> um array que representa os meses
    e outro array que representa a quantidade de dias do mês
    1, 2, 3, 4, 5, 6 6meses
    31, 28, 31, 30, 31, 30 dias
    */
        int[][] dias = new int[3][3];//A primeira parte do array deve ter o tamanho definido
                                     //AS outras partes precisam ter tamanho definido em um primeiro momento
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j <dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        /*--------------------------------------------------------------------------------------------
        for each
        Em um array multidimensional o tipo é um array de inteiros, e não mais um int
         */
        for (int[] arrayBase : dias){//Cria uma variável de referência
            for(int num : arrayBase){
                System.out.println(num);
            }
        }

    }
}
