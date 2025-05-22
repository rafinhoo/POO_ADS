public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Rafael", 123, 1000);
        ContaPoupanca conta2 = new ContaPoupanca("João", 456, 1500);
        ContaEspecial conta3 = new ContaEspecial("Maria", 789, 500, 300);

        conta1.Depositar(200);
        conta1.Sacar(100);

        conta2.Depositar(300);
        conta2.calcularNovoSaldo();

        conta3.Sacar(700);

        System.out.println("Saldo conta1: " + conta1.getSaldo());
        System.out.println("Saldo conta2 (poupança): " + conta2.getSaldo());
        System.out.println("Saldo conta3 (especial): " + conta3.getSaldo());
    }
}
