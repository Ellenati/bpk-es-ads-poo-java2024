package exercicio15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Outer Wilds", "Exploração/Espacial/Mistério", 67.99);
        jogo.iniciarJogo();
        jogo.pausarJogo();
        System.out.println(jogo);
    }
}
