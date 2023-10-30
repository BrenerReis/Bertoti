import java.util.ArrayList;
import java.util.List;

public class ControleFrigorifico {
    private double temperatura;
    private double umidade;
    private List<Observer> observers = new ArrayList<>();

    public double setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        return this.temperatura;
    }

    public double setUmidade(double umidade) {
        this.umidade = umidade;
        return this.umidade;
    }

    public void regularizacao() {
        for (Observer observer : observers) {
            observer.regular(temperatura, umidade);
        }
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }
}
