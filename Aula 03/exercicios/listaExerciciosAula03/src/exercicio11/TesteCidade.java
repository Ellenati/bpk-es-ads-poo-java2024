package exercicio11;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Toledo", 120000, "PR");
        cidade.aumentarPopulacao(5000);
        cidade.diminuirPopulacao(2000);
        System.out.println(cidade);
    }
}
