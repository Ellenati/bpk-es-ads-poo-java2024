package exercicio17;

public class Animal {
    public String especie;
    public int idade;
    public double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar() {
        System.out.println("O animal da espécie " + especie + " foi alimentado.");
    }

    public void dormir() {
        System.out.println("O animal da espécie " + especie + " está dormindo.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                " kg}";
    }

}
