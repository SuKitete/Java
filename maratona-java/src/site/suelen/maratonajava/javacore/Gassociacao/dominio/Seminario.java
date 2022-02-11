package site.suelen.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor2 professor;

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Endereço: "+local.getEndereco());
        if(professor != null) {
            System.out.println("Nome do Professor: " + professor.getNome());
            System.out.println("Especialidade do Professor " + professor.getNome() + ": " + professor.getEspecialidade());
        }
        if(alunos != null){
            for(Aluno aluno: alunos){
                System.out.println("Nome do Aluno: "+aluno.getNome());
                System.out.println("Idade do Aluno "+aluno.getNome()+": "+aluno.getIdade());
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor2 getProfessor() {
        return professor;
    }

    public void setProfessor(Professor2 professor) {
        this.professor = professor;
    }
}
