package exercicio22;

public class Empresa {
    private String nome;
    private String cnpj;
    private int numeroFuncionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratarFuncionario() {
        numeroFuncionarios++;
        System.out.println("Um funcionário foi contratado. Total de funcionários: " + numeroFuncionarios);
    }

    public void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Um funcionário foi demitido. Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Nenhum funcionário para demitir.");
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                '}';
    }
}
