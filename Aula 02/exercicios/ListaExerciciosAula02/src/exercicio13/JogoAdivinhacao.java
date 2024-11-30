package exercicio13;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativa = 0;
        int palpites = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número de 1 a 100.");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            palpites++;

            if (tentativa < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou em " + palpites + " tentativas.");
            }
        } while (tentativa != numeroAleatorio);
    }
}
