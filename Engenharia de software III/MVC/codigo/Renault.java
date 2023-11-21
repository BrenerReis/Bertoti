public class Renault implements Modelo {
    private View v;
    private Concessionaria concessionaria;

    public void escolherModelo() {
        this.v.setCarro(new Carro("Renault", 5, 20000.00));
    }

    public void setV(View view) {
        this.v = view;
    }
}
