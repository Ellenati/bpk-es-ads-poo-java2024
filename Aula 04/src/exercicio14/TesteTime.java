package exercicio14;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Corinthians", "Tite");
        time.adicionarJogador("João");
        time.adicionarJogador("Pedro");
        time.removerJogador("Carlos");
        System.out.println(time);
    }
}
