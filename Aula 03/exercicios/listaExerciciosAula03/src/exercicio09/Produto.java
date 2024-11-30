package exercicio09;

public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
        System.out.println("Estoque aumentado em " + quantidade + ". Estoque atual: " + quantidadeEstoque);
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Estoque diminuído em " + quantidade + ". Estoque atual: " + quantidadeEstoque);
        } else {
            System.out.println("Não há estoque suficiente para retirar " + quantidade + " unidades.");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=R$ " + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }

}
