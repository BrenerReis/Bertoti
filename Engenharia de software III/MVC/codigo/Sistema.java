public class Sistema {
    private String licenca;
    private int ano;

    public Sistema(String licenca, int ano) {
        this.licenca = licenca;
        this.ano = ano;
    }

    public String getLicenca() {
        return licenca;
    }

    public int getAno() {
        return ano;
    }

    public boolean matches(Sistema s) {
        return this.licenca.equals(s.getLicenca()) && this.ano == s.getAno();
    }
}
