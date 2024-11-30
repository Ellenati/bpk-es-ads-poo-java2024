package exercicio11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        populacao += quantidade;
        System.out.println("A população da cidade " + nome + " agora é " + populacao);
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("A população da cidade " + nome + " agora é " + populacao);
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }
}
