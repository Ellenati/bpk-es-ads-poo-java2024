package exercicio12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("Shrek", "Kelly Absury", 89);
        filme.iniciarFilme();
        filme.pararFilme();
        System.out.println(filme);
    }
}
