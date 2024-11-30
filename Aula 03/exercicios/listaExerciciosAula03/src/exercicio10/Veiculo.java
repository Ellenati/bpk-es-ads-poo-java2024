package exercicio10;

public class Veiculo {
    public String tipo;
    public String placa;
    public String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("O veículo de placa " + placa + " foi abastecido.");
    }

    public void lavar() {
        System.out.println("O veículo de placa " + placa + " foi lavado.");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

}
