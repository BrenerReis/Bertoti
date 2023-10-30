public class Main {
    public static void main(String[] args) {
        Planta planta1 = new Planta("Rosa", "Rosaceae");
        Planta planta2 = new Planta("Orquídea", "Orchidaceae");

        Area area = new Area();
        area.adicionarPlanta(planta1);
        area.adicionarPlanta(planta2);

        area.informacoesEstufa();

        area.removerPlanta(planta1);
        area.informacoesEstufa();
    }
}
