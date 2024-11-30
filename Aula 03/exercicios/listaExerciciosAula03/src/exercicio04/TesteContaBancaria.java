package exercicio04;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", 1000);
        conta.depositar(500);
        conta.sacar(300);
        System.out.println(conta);
        conta.sacar(1500);
        System.out.println(conta);
    }
}
