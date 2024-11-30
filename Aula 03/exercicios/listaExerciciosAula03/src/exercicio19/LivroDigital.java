package exercicio19;

public class LivroDigital {
    public String titulo;
    public String autor;
    public double tamanhoArquivo; // em MB
    public boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false;
    }

    public void abrirLivro() {
        if (!aberto) {
            aberto = true;
            System.out.println("O livro digital '" + titulo + "' foi aberto.");
        } else {
            System.out.println("O livro digital já está aberto.");
        }
    }

    public void fecharLivro() {
        if (aberto) {
            aberto = false;
            System.out.println("O livro digital '" + titulo + "' foi fechado.");
        } else {
            System.out.println("O livro digital já está fechado.");
        }
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                " MB, aberto=" + aberto +
                '}';
    }

}
