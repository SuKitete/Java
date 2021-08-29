package site.suelen.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        /*
        OPERADOR TERNARIO
        SINTAXE -> condição ? verdadeiro : falso;
         */
        double salario = 6000;
        String resultado = salario>5000 ? "Eu vou doar 500 para o DevDojo" : "Não tenho condições, mas terei";

        System.out.println(resultado);
    }
}
    /*
    JEITO INADEQUADO DE USAR O OPERADOR TERNARIO
    NÃO DEVE SER USADO QUANDO EXISTE MAIS DE DUAS CONDIÇÕES, O CÓDIGO FICA CONFUSO

    int idade = 19;
    String categoria;

        categoria = idade<15? "Categoria infantil" : idade>=15 && idade<18? "Categoria juvenil" : "Categoria adulto";

        System.out.println(categoria);
        */
