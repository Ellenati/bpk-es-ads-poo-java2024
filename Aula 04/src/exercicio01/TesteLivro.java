package exercicio01;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 500);
        livro.abrirLivro();
        livro.lerPagina();
        System.out.println(livro);
    }
}
