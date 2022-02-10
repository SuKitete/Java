package site.suelen.maratonajava.javacore.Bintroducaometodos.dominio;

public class Fucionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(this.salarios == null){
            return;
        }
        for(double salario: this.salarios){
            System.out.println(salario);

            }
        mediaSalario();
        }

        public void mediaSalario(){
        if(this.salarios == null){
            return;
        }

        for(double num: this.salarios){
            media += num;
        }
        media /= this.salarios.length;
            System.out.println(media);
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}

