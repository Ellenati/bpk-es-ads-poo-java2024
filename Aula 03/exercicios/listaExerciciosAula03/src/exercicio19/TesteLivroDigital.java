package exercicio19;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Java Básico", "Fulano", 2.5);
        livro.abrirLivro();
        livro.fecharLivro();
        System.out.println(livro);
    }
}
