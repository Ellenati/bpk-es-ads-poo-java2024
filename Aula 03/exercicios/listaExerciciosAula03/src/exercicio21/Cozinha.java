package exercicio21;

public class Cozinha {
    public String tipo;
    public int quantidadePessoas;
    public String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha está preparando comida.");
    }

    public void limpar() {
        System.out.println("A cozinha foi limpa.");
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
