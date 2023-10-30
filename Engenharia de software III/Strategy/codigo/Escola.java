public class Escola implements Nota {
    private float nota;

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float lancarNota() {
        return nota;
    }
}
