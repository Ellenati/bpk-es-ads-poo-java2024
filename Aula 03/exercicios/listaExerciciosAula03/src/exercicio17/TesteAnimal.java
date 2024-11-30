package exercicio17;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Elefante", 10, 3000);
        animal.alimentar();
        animal.dormir();
        System.out.println(animal);
    }
}
