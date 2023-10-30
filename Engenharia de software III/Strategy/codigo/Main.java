public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Aluno aluno = new Aluno("João", 12345);
        Professor professor = new Professor("Maria", "Matemática");

        escola.setNota(7.5f);
        aluno.setNota(8.0f);
        professor.setNota(9.2f);

        System.out.println("Nota da Escola: " + escola.lancarNota());
        System.out.println("Nota do Aluno " + aluno.nome + ": " + aluno.lancarNota());
        System.out.println("Nota do Professor " + professor.nome + ": " + professor.lancarNota());
    }
}
