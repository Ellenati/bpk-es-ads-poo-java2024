package exercicio21;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Sla", 5, "Branca");
        cozinha.cozinhar();
        cozinha.limpar();
        System.out.println(cozinha);
    }
}
