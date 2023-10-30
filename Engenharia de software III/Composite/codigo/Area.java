import java.util.ArrayList;
import java.util.List;

public class Area implements Estufa {
    private double temperatura;
    private double umidade;
    private List<Estufa> plantas = new ArrayList<>();

    public void adicionarPlanta(Estufa planta) {
        plantas.add(planta);
    }

    public void removerPlanta(Estufa planta) {
        plantas.remove(planta);
    }

    public void informacoesEstufa() {
        System.out.println("Informações da Área: Temperatura - " + temperatura + ", Umidade - " + umidade);
        System.out.println("Plantas na Área:");
        for (Estufa planta : plantas) {
            planta.informacoesEstufa();
        }
    }
}
