package exercicio15;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Fatorial (iterativo): " + fatorialIterativo(numero));
        System.out.println("Fatorial (recursivo): " + fatorialRecursivo(numero));
    }

    public static int fatorialIterativo(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }
}
