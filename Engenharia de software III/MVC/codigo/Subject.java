import java.util.List;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(List<Conta> encontrados);
}
