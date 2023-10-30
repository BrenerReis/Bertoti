public class Aluno implements Nota {
    private String nome;
    private float matricula;
    private float nota;

    public Aluno(String nome, float matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float lancarNota() {
        return nota;
    }
}
