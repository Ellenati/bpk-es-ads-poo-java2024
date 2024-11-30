package exercicio15;

public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void iniciarJogo() {
        System.out.println("O jogo " + nome + " foi iniciado.");
    }

    public void pausarJogo() {
        System.out.println("O jogo " + nome + " foi pausado.");
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                '}';
    }
}
