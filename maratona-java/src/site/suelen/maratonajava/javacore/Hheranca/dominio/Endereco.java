package site.suelen.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String Rua;
    private String cep;

    public void imprime(){
        Pessoa p = new Pessoa("João");
        System.out.println(p.nome);//Como está dentro do mesmo pacote pode acessar o atributo protected
    }                              //como se ele fosse público(no caso o atributo nome está protected)

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
