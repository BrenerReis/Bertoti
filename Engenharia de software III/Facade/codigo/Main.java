public class Main {
    public static void main(String[] args) {
        LojaWebFacade loja = new LojaWebFacade();
        String cliente = "João";
        String[] itens = { "ProdutoA", "ProdutoB" };

        loja.realizarPedido(cliente, itens);
        loja.acompanharEnvio(12345);
    }
}
