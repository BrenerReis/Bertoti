public class Professor implements Nota {
    private String nome;
    private String materia;
    private float nota;

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float lancarNota() {
        return nota;
    }
}
