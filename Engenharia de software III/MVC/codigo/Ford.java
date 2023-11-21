public class Ford implements Modelo {
    private View v;
    private Concessionaria concessionaria;

    public void escolherModelo() {
        this.v.setCarro(new Carro("Ford", 4, 25000.00));
    }

    public void setV(View view) {
        this.v = view;
    }
}
