package exercicio09;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.50, 100);
        produto.aumentarEstoque(20);
        produto.diminuirEstoque(50);
        System.out.println(produto);
    }
}
