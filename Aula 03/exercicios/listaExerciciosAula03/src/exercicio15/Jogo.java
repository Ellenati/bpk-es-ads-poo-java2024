package exercicio15;

public class Jogo {
    public String nome;
    public String genero;
    public double preco;
    public boolean emProgresso;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.emProgresso = false;
    }

    public void iniciarJogo() {
        if (!emProgresso) {
            emProgresso = true;
            System.out.println("O jogo '" + nome + "' foi iniciado.");
        } else {
            System.out.println("O jogo já está em progresso.");
        }
    }

    public void pausarJogo() {
        if (emProgresso) {
            emProgresso = false;
            System.out.println("O jogo '" + nome + "' foi pausado.");
        } else {
            System.out.println("O jogo não está em progresso.");
        }
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=R$ " + preco +
                ", emProgresso=" + emProgresso +
                '}';
    }

}
