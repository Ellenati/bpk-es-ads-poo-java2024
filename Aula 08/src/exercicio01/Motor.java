package exercicio01;

public class Motor {
    private String modelo;
    private int potencia;
    private TipoCombustivel tipoCombustivel; // Utilizando enum
    private int cilindradas;
    private boolean ligado;
    private int rpm;

    public Motor(String modelo, int potencia, TipoCombustivel tipoCombustivel, int cilindradas) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.cilindradas = cilindradas;
        this.ligado = false;
        this.rpm = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getRpm() {
        return rpm;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            rpm = 1000;
            System.out.println("Motor ligado. RPM inicial: " + rpm);
        } else {
            System.out.println("Motor já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            rpm = 0;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("Motor já está desligado.");
        }
    }

    public void aumentarPotencia(int incremento) {
        potencia += incremento;
        System.out.println("Potência aumentada para: " + potencia + " cavalos.");
    }

    public void reduzirPotencia(int decremento) {
        if (potencia - decremento >= 0) {
            potencia -= decremento;
            System.out.println("Potência reduzida para: " + potencia + " cavalos.");
        } else {
            System.out.println("Não é possível reduzir a potência para um valor negativo.");
        }
    }

    public void acelerar(int incrementoRpm) {
        if (ligado) {
            rpm += incrementoRpm;
            System.out.println("RPM aumentada para: " + rpm);
        } else {
            System.out.println("Não é possível acelerar. O motor está desligado.");
        }
    }

    public void reduzirRpm(int decrementoRpm) {
        if (ligado && rpm - decrementoRpm >= 0) {
            rpm -= decrementoRpm;
            System.out.println("RPM reduzida para: " + rpm);
        } else if (!ligado) {
            System.out.println("Não é possível reduzir o RPM. O motor está desligado.");
        } else {
            System.out.println("Não é possível reduzir o RPM para um valor negativo.");
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                ", tipoCombustivel=" + tipoCombustivel +
                ", cilindradas=" + cilindradas +
                ", ligado=" + ligado +
                ", rpm=" + rpm +
                '}';
    }
}
