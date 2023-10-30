public class LojaWebFacade {
    private Pedido pedido;
    private Estoque estoque;
    private Pagamento pagamento;
    private Envio envio;

    public LojaWebFacade() {
        pedido = new Pedido();
        estoque = new Estoque();
        pagamento = new Pagamento();
        envio = new Envio();
    }

    public void realizarPedido(String cliente, String[] itens) {
        System.out.println("Realizando pedido para o cliente: " + cliente);
        pedido.fazerPedido();
        estoque.verificar();
        double total = precoTotal(itens);
        processarPagamento(cliente, total);
        envio.enviar();
        System.out.println("Pedido concluído.");
    }

    public void acompanharEnvio(int pedidoId) {
        System.out.println("Acompanhando envio do pedido #" + pedidoId);
        envio.enviar();
        System.out.println("Envio concluído.");
    }

    public double precoTotal(String[] itens) {
        double total = 0.0;
        return total;
    }

    public void processarPagamento(String cliente, double valor) {
        System.out.println("Processando pagamento de R$" + valor + " para o cliente " + cliente);
        pagamento.fazerPagamento();
        System.out.println("Pagamento processado.");
    }
}
