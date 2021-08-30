package site.suelen.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        //Imprima os primeiros 25 números de um dado valor, por exemplo 50
        int valorMax = 50;
        for(int i = 0; i <= valorMax; i++){
            if(i <= 25){ //Desta forma continua acontecendo algo e disperdiça processamento
                System.out.println(i);
            }
        }
        for(int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break; //Para evitar isso usa-se o break
            }          // Ele não quebra o laço do if, e sim do for
            System.out.println(i);
        }
    }
}
