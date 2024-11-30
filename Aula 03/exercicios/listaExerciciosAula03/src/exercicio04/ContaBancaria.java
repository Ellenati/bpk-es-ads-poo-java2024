package exercicio04;

public class ContaBancaria {
    public String numeroConta;
    public double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
