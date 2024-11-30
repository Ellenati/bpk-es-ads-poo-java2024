package exercicio03;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

}

