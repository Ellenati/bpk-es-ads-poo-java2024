package exercicio08;

public class Professor {
    public String nome;
    public String disciplina;
    public double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        System.out.println(nome + " está dando aula de " + disciplina + ".");
    }

    public void corrigirProvas() {
        System.out.println(nome + " está corrigindo provas.");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salario=R$ " + salario +
                '}';
    }

}
