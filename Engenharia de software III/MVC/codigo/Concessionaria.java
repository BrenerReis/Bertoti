import java.util.ArrayList;
import java.util.List;

public class Concessionaria implements Subject {
    private List<Carro> carros;
    private List<Observer> observers;

    public Concessionaria() {
        carros = new ArrayList<>();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(List<Carro> novosCarros) {
        for (Observer observer : observers) {
            observer.update(novosCarros);
        }
    }

    public void addCarro(Carro carro) {
        carros.add(carro);
        notifyObservers(carros);
    }

    public Carro buscarCarro(Carro carro) {
        return null;
    }
}

