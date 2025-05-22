public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void Sacar(double valor) {
        if (valor > 0 && (this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado com uso do limite.");
        } else {
            System.out.println("Não foi possível realizar o saque: saldo + limite insuficiente.");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
