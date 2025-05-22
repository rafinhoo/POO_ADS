public class ContaPoupanca extends ContaBancaria {
    private double rendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double rendimento) {
        super(nomeCliente, numConta, rendimento);
        this.rendimento = rendimento;
    }

    public void calcularNovoSaldo() {
        this.saldo += saldo * rendimento;
    }
}

