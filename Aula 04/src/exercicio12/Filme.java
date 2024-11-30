package exercicio12;

public class Filme {
    private String titulo;
    private String diretor;
    private double duracao;

    public Filme(String titulo, String diretor, double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void iniciarFilme() {
        System.out.println("O filme " + titulo + " está sendo reproduzido.");
    }

    public void pararFilme() {
        System.out.println("O filme " + titulo + " foi pausado.");
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
