package exercicio08;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Jhoni", "Programação Orientada a Objetos e UML", 4000.00);
        professor.darAula();
        professor.corrigirProvas();
        System.out.println(professor);
    }
}
