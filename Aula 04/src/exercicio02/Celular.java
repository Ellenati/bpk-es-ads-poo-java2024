package exercicio02;

public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligar() {
        System.out.println("Ligando o celular " + modelo);
    }

    public void desligar() {
        System.out.println("Desligando o celular " + modelo);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria=" + capacidadeBateria +
                '}';
    }
}
