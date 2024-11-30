package exercicio01;

import java.util.Objects;

public class Livro {
    public String titulo;
    public String autor;
    public int numeroDePaginas;
    public int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrirLivro() {
        System.out.println("O livro foi aberto.");
        paginaAtual = 1;
    }

    public void lerPagina() {
        if (paginaAtual <= numeroDePaginas) {
            System.out.println("Lendo a página " + paginaAtual);
            paginaAtual++;
        } else {
            System.out.println("Você já terminou de ler o livro!");
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", paginaAtual=" + paginaAtual +
                '}';
    }


}
