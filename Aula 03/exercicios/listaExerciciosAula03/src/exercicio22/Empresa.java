package exercicio22;

public class Empresa {
    public String nome;
    public String CNPJ;
    public int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratarFuncionario() {
        numeroFuncionarios++;
        System.out.println("Um novo funcionário foi contratado. Total de funcionários: " + numeroFuncionarios);
    }

    public void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Um funcionário foi demitido. Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                '}';
    }

}
