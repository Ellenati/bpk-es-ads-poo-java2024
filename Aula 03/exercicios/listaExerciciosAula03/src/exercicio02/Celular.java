package exercicio02;

public class Celular {
    public String marca;
    public String modelo;
    public int capacidadeBateria;
    public boolean ligado;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O celular está ligado.");
        } else {
            System.out.println("O celular já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O celular está desligado.");
        } else {
            System.out.println("O celular já está desligado.");
        }
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria=" + capacidadeBateria +
                ", ligado=" + ligado +
                '}';
    }

}
