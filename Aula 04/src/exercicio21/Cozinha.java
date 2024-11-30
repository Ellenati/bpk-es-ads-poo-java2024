package exercicio21;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha de tipo " + tipo + " está sendo utilizada para cozinhar.");
    }

    public void limpar() {
        System.out.println("A cozinha de cor " + cor + " foi limpa.");
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "tipo='" + tipo + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
