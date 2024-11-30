package exercicio05;

public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                '}';
    }

}
