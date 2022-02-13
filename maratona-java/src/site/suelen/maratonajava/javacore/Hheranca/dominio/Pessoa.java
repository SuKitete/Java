package site.suelen.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    /*
   PROTECTED
   Se for uma subclasse consegue acessar os atributos como se fosse público em qualquer lugar
   Porém, se não for uma subclasse só pode acessar os atributos estando dentro do mesmo pacote
    */
    protected String nome;//Atributo com protected
    private String cpf;
    private Endereco endereco;

    /*
    Construtor em herança
    Após criar um construtor na classe pai é necessário criar um construtor para a subclasse
     */
    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" "+this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
