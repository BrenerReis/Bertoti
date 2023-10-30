import java.util.ArrayList;
import java.util.List;

public class Estoque implements Subject {
    private List<Conta> sistema;
    private List<Observer> observers;

    public Estoque() {
        sistema = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addSistema(Conta sistema) {
        this.sistema.add(sistema);
    }

    public void buscarSistema(Conta sistema) {
    
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(List<Conta> encontrados) {
        for (Observer o : observers) {
            o.update(encontrados);
        }
    }
}
