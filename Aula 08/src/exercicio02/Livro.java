package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public void adicionarPagina(String conteudo) {
        int numeroPagina = paginas.size() + 1;  // O número da página é determinado pela quantidade de páginas já existentes
        Pagina pagina = new Pagina(numeroPagina, conteudo);
        paginas.add(pagina);
    }

    public void mostrarPaginas() {
        for (Pagina pagina : paginas) {
            System.out.println(pagina);
        }
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + "\nAutor: " + autor;
    }
}
