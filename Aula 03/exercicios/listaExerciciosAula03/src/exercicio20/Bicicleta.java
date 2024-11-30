package exercicio20;

public class Bicicleta {
    public String marca;
    public String modelo;
    public int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("A bicicleta da marca " + marca + " está sendo pedalada.");
    }

    public void frear() {
        System.out.println("A bicicleta da marca " + marca + " foi freada.");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanhoRoda=" + tamanhoRoda +
                '}';
    }

}
