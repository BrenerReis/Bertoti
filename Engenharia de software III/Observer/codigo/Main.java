public class Main {
    public static void main(String[] args) {
        ControleFrigorifico controle = new ControleFrigorifico();
        Controlador controlador = new Controlador();
        SistemaRefrigeracao sistema = new SistemaRefrigeracao();

        controle.addObserver(controlador);
        controle.addObserver(sistema);

        controle.setTemperatura(5.0);
        controle.setUmidade(80.0);

        controle.regularizacao();
    }
}
