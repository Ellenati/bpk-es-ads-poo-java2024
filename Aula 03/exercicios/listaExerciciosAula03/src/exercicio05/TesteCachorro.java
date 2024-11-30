package exercicio05;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", "Labrador", 3);
        cachorro.latir();
        cachorro.correr();
        System.out.println(cachorro);
    }
}
