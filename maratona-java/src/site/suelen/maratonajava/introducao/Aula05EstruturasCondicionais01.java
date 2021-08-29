package site.suelen.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
    int idade = 15;
    boolean isAutorizadoComprarBebida = idade >= 18;

    if(isAutorizadoComprarBebida == false) {
        System.out.println("Autorizado a comprar bebida alcoolica");
    }else{
        System.out.println("Não autorizado a comprar bebida alcoolica"); //O else depende do if para ser executado
        }

    if(isAutorizadoComprarBebida){ //if só é executado se for uma condição verdadeira
        System.out.println("Autorizado a comprar bebida alcoolica");
    }
    if(!isAutorizadoComprarBebida){ //Pode usar o !(not) no lugar do else caso a proposição não seja verdade
                                    //porém esta forma é independente
        System.out.println("Não autorizado a comprar bebida alcoolica");
    }
    }
}
