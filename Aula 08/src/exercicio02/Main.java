package exercicio02;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("A Incendiaria", "Stephen King");
        livro.adicionarPagina("Introdução: não sei");
        livro.adicionarPagina("Capítulo 1: tbm não sei");
        livro.adicionarPagina("Capítulo 2: n sei oq por 3.0");

        System.out.println(livro);
        livro.mostrarPaginas();
    }

}
