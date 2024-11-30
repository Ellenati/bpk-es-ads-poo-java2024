package exercicio09;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha uma operação: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1 -> System.out.println("Resultado: " + (numero1 + numero2));
            case 2 -> System.out.println("Resultado: " + (numero1 - numero2));
            case 3 -> System.out.println("Resultado: " + (numero1 * numero2));
            case 4 -> System.out.println("Resultado: " + (numero1 / numero2));
            default -> System.out.println("Operação inválida.");
        }
    }
}
