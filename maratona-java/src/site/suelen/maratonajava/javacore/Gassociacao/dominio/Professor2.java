package site.suelen.maratonajava.javacore.Gassociacao.dominio;

public class Professor2 {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor2(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("****DADOS DO SEMINÁRIO****\n");
        if (this.seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Endereço: " + seminario.getLocal().getEndereco());
            System.out.println("\n******PALESTRANTE******\n");
            System.out.println("Nome do Professor: " + this.nome);
            System.out.println("Especialidade do Professor: " + this.especialidade);
            System.out.println("\n******PARTICIPANTES******\n");
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + "\nIdade do Aluno: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
