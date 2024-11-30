package exercicio16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Livraria Central", "Rua A, 123", "(45) 99999-9999");
        loja.abrirLoja();
        loja.fecharLoja();
        System.out.println(loja);
    }
}
