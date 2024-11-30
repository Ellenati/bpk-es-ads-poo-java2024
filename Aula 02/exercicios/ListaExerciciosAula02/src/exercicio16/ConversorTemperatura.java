package exercicio16;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        if (escolha == 1) {
            double fahrenheit = (temperatura * 9 / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } else if (escolha == 2) {
            double celsius = (temperatura - 32) * 5 / 9;
            System.out.println("Temperatura em Celsius: " + celsius);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
