package exercicio04;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saque inválido. Verifique o valor.");
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
