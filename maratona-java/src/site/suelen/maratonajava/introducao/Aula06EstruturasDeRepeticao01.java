package site.suelen.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
    /*
    ESTRUTURAS DE REPETIÇÃO
    while, do while, for

    while
    Só é excutado se a condição for verdadeira
    */
        int contador = 12;
        while(contador < 10){
                System.out.println(++contador);
            }

    /*
    do while
    Vai executar pelo menos uma vez, mesmo se a condição for falsa
    */
        do {
            System.out.println("Dentro do do-while");
        }while (contador <10);
    /*
    for
    Trabalha com índice
    sintaxe -> for(declara a variável;até onde será executada a repetição;como a variável altera o status) {
        O que vai acontecer aqui dentro;
    }
     */
        for(int i = 0; i < 10; i++){ //É comum usar i na variável, se tiver mais uma usa o j
            System.out.println("For " +i);
        }


        }
    }


