import java.util.List;

public class View {
    private Modelo modelo;
    private List<Carro> carros;

    public void setCarro(Carro c) {
        this.carros.add(c);
    }

    public void update(List<Carro> carros) {
        this.carros = carros;
    }
}

