public class Planta implements Estufa {
    private String nome;
    private String especie;

    public Planta(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void informacoesEstufa() {
        System.out.println("Planta: Nome - " + nome + ", Espécie - " + especie);
    }
}
