package exercicio01;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void ligarCarro() {
        motor.ligar();
        System.out.println("Carro " + modelo + " ligado.");
    }

    public void desligarCarro() {
        motor.desligar();
        System.out.println("Carro " + modelo + " desligado.");
    }

    public void turboBoost() {
        motor.aumentarPotencia(50);
        System.out.println("Turbo Boost ativado! Potência aumentada em 50 cavalos.");
    }

    public void reduzirPotenciaMotor() {
        motor.reduzirPotencia(30);
        System.out.println("Potência do motor reduzida em 30 cavalos.");
    }

    public void acionarFreio(int decrementoRpm) {
        motor.reduzirRpm(decrementoRpm);
        System.out.println("Freio acionado. RPM reduzida.");
    }

    public void acionarAcelerador(int incrementoRpm) {
        motor.acelerar(incrementoRpm);
        System.out.println("Acelerador acionado. RPM aumentada.");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", motor=" + motor.getModelo() +
                ", tipoCombustivel=" + motor.getTipoCombustivel() +
                '}';
    }
}
