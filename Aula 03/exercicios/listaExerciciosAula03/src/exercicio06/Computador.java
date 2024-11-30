package exercicio06;

public class Computador {
    public String processador;
    public int memoriaRAM;
    public int armazenamento;
    public boolean ligado;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O computador foi ligado.");
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O computador foi desligado.");
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                "GB, armazenamento=" + armazenamento +
                "GB, ligado=" + ligado +
                '}';
    }

}

