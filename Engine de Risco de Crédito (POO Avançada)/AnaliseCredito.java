enum StatusAnalise { APROVADO, NEGADO, EM_ANALISE_HUMANA }

class PropostaCredito {
    private String cpfCliente;
    private double rendaMensal;
    private double valorSolicitado;
    private int scoreSerasa;

    public PropostaCredito(String cpfCliente, double rendaMensal, double valorSolicitado, int scoreSerasa) {
        this.cpfCliente = cpfCliente;
        this.rendaMensal = rendaMensal;
        this.valorSolicitado = valorSolicitado;
        this.scoreSerasa = scoreSerasa;
    }

    public StatusAnalise avaliarRisco() {
        // Regra 1: Comprometimento de renda maior que 30% do valor parcelado (estimando 12x)
        double parcelaEstimada = valorSolicitado / 12;
        if (parcelaEstimada > (rendaMensal * 0.30) || scoreSerasa < 300) {
            return StatusAnalise.NEGADO;
        } 
        if (scoreSerasa >= 700 && parcelaEstimada <= (rendaMensal * 0.20)) {
            return StatusAnalise.APROVADO;
        }
        return StatusAnalise.EM_ANALISE_HUMANA;
    }

    public String getCpfCliente() { return cpfCliente; }
}

public class AnaliseCredito {
    public static void main(String[] args) {
        PropostaCredito cliente1 = new PropostaCredito("123.456.789-00", 5000.00, 10000.00, 750);
        PropostaCredito cliente2 = new PropostaCredito("987.654.321-11", 2500.00, 15000.00, 400);

        System.out.println("CPF: " + cliente1.getCpfCliente() + " | Resultado: " + cliente1.avaliarRisco());
        System.out.println("CPF: " + cliente2.getCpfCliente() + " | Resultado: " + cliente2.avaliarRisco());
    }
}