public class SistemaRefrigeracao implements Observer {
    public void regular(double temperatura, double umidade) {
        System.out.println("Sistema de Refrigeração: Regularizando temperatura " + temperatura + " e umidade " + umidade);
    }
}
