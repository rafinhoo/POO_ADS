public class ContaBancaria {
    protected String nomeCliente;
    protected int numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o depósito.");
        }
    }

    public void Sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado.");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }
}
