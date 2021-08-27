package site.suelen.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Suelen";
        String endereco = "São João da Madeira 33";
        float salario = 5000.50F;
        String dataRecebimentoSalario = "01/04/2021";
        //o texto pode ser impresso tanto pelo println quanto usando o String e imprimindo a variavel no println
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}

