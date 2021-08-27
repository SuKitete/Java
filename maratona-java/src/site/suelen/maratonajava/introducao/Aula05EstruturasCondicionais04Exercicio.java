package site.suelen.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        /*
        se salario >= 0 e salario <= 34712 = 9,70% taxa
        se salario >= 34713 e salario <= 68507 = 37,35% taxa
        salario >= 68508 = 49,50% taxa
         */
        double valorImposto;
        double salarioAnual = 80000;
        if(salarioAnual <=34712){
            valorImposto = salarioAnual * 0.0970;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * 0.3735;
        }else{
            valorImposto = salarioAnual * 0.4950;
        }
        System.out.println(valorImposto);
    }
}
