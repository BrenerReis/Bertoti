import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Conta conta1 = new ContaImpl();
        Conta conta2 = new ContaImpl();
        Sistema sistema1 = new Sistema("ABC123", 2023);
        Sistema sistema2 = new Sistema("XYZ456", 2022);

        View view1 = new ViewImpl();
        View view2 = new ViewImpl();
        estoque.registerObserver(view1);
        estoque.registerObserver(view2);

        estoque.addSistema(conta1);
        estoque.addSistema(conta2);

        List<Conta> encontrados = new ArrayList<>();
        for (Conta sistema : estoque.sistema) {
            if (sistema instanceof Sistema && ((Sistema) sistema).matches(sistema1)) {
                encontrados.add(sistema);
            }
        }

        estoque.notifyObservers(encontrados);

        for (Conta sistema : encontrados) {
            System.out.println("Sistema encontrado: " + ((Sistema) sistema).getLicenca() + " - " + ((Sistema) sistema).getAno());
        }
    }
}
