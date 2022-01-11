package site.suelen.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int arrayInt[][] = new int[3][];//Dessa forma ocorrerá uma excessão,
                                        //pois o valor de inicialização é nulo
        int array[] = {1, 2, 3};

        arrayInt[0] = new int[]{1, 2,};//É possível atribuir valor desta forma,
        arrayInt[1] = new int[]{1, 2, 3, 4, 5};//podendo colocar diferntes tamanhos para o array
        arrayInt[2] = array;

        //Outra forma de atribuir valor a um array multidimensional
        int[][] arrayInt2 = {{1, 2}, {1, 2, 3, 4, 5}, {1, 2, 3}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n----------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n\n##############");

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n----------");
            for (int num : arrayBase) {
                System.out.print(num + " ");

            }
        }
    }
}
