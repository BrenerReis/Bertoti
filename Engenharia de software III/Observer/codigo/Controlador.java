public class Controlador implements Observer {
    public void regular(double temperatura, double umidade) {
        System.out.println("Controlador: Regularizando temperatura " + temperatura + " e umidade " + umidade);
    }
}
