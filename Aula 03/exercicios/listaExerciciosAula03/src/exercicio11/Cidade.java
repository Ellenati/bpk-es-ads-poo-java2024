package exercicio11;

public class Cidade {
    public String nome;
    public int populacao;
    public String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        populacao += quantidade;
        System.out.println("População aumentada em " + quantidade + ". População atual: " + populacao);
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("População diminuída em " + quantidade + ". População atual: " + populacao);
        } else {
            System.out.println("A quantidade a ser diminuída excede a população atual.");
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
