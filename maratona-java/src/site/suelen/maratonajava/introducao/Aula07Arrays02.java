package site.suelen.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
    /*
    As posições de um array possui um valor padrão de inicialização, que muda conforme o tipo primitivo
    byte, short, int, long, float e double = 0
    char '\u0000' = ' ' -> unicode, um espaço em branco
    boolean = false
    String = null -> todos os tipos reference será null
    */
        int[] idades = new int[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        char[] letra = new char[3];
        System.out.println(letra[0]);
        System.out.println(letra[1]);
        System.out.println(letra[2]);

        float[] valor = new float[3];
        System.out.println(valor[0]);
        System.out.println(valor[1]);
        System.out.println(valor[2]);

        boolean[] boleano = new boolean[3];
        System.out.println(boleano[0]);
        System.out.println(boleano[1]);
        System.out.println(boleano[2]);

        String[] texto = new String[3];
        System.out.println(texto[0]);
        System.out.println(texto[1]);
        System.out.println(texto[2]);

    //____________________________________________________________________________________________________

    //Imprimindo um array com for

    //Um array não aumenta dinamicamente, caso seja necessário aumentar é necessário editar e compilar novamente

        String [] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "Elena";
        nomes[2] = "Mario";

        for (int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
        }
        //Uma opção para mudar de acordo com o tamanho do array é usar o lenght
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    /*Também é possível aumentar o tamanho da seguinte forma:
        nomes = new String[5];
    Dessa forma a variável antiga morre e cria-se um novo objeto de referência na memória
     */
    }
}
