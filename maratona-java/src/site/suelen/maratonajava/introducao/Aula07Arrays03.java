package site.suelen.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};//Outra forma de atribuir valores ao vetor
                                         //Dessa forma o número de posições é automático

        int[] numeros3 = new int[]{1, 2, 3, 4, 5};//Outra forma de atribuir valor ao vetor

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        /*--------------------------------------------------------------------------------
        for each
        sintaxe
        for(tipo nomeVariável : array de escolha)
        {
        }
        Com esse for não é possível acessar um índice específico,
        para isso usa-se o outro que é indexado
         */
        for (int num : numeros3) {//A variável (num) irá percorrer cada uma das posições do array
            System.out.println(num);//O tipo da variável deve ser o mesmo tipo da variável do array
        }
    }
}
