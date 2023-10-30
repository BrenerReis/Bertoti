import java.util.List;

public interface View {
    void setC(Conta conta);
    void update(List<Conta> contaList);
    void imprimirDadosSistema();
    void criarContaBancaria();
}
