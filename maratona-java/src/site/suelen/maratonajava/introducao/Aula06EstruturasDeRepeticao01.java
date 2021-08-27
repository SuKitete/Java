package site.suelen.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
    //while, do while, for
        double contador = 0;
        while(contador <= 1000000){
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }

        }
}

