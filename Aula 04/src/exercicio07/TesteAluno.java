package exercicio07;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Natalia", "20234336", "Engenharia de Software");
        double[] notas = {8.5, 7.0, 9.0};
        System.out.println(aluno);
        System.out.println("Média: " + aluno.calcularMedia(notas));
    }
}
