package site.suelen.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
        ELSE IF
        FORMA PARA EXECUTAR 3 OU MAIS CONDIÇÕES DIFERENTES

        se idade < 15 categoria infantil
        se idade >= 15 && idade < 18 categoria juvenil
        se idade >= 18 categoria adulto

        TODA VARIAVEL DE ESCOPO LOCAL DEVE SER INICIALIZADA ANTES DE SER EXECUTADA
        UMA OPÇÃO SERIA ATRIBUIR UM VALOR VAZIO A VARIÁVEL, EX. String categoria = "";
         */
        int idade = 19;
        String categoria;

        if(idade <15){
            categoria = "Categoria infantil";
        }else if(idade >=15 && idade <18){
            categoria = "Categoria juvenil";
        }else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
