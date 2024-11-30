package exercicio12;

public class Filme {
    public String titulo;
    public String diretor;
    public int duracao;
    public boolean emExibicao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.emExibicao = false;
    }

    public void iniciarFilme() {
        if (!emExibicao) {
            emExibicao = true;
            System.out.println("O filme '" + titulo + "' foi iniciado.");
        } else {
            System.out.println("O filme já está em exibição.");
        }
    }

    public void pararFilme() {
        if (emExibicao) {
            emExibicao = false;
            System.out.println("O filme '" + titulo + "' foi pausado.");
        } else {
            System.out.println("O filme não está em exibição.");
        }
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                " minutos, emExibicao=" + emExibicao +
                '}';
    }

}
