package exercicio01;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("V8", 450, TipoCombustivel.GASOLINA, 5000);
        Motor motor2 = new Motor("V6", 300, TipoCombustivel.DIESEL, 3500);
        Motor motor3 = new Motor("Elétrico", 0, TipoCombustivel.ELETRICO, 0);

        Carro carro1 = new Carro("Mustang", motor1);
        Carro carro2 = new Carro("F-150", motor2);
        Carro carro3 = new Carro("Tesla Model S", motor3);

        carro1.ligarCarro();
        carro1.turboBoost();
        System.out.println(carro1);

        carro2.ligarCarro();
        carro2.reduzirPotenciaMotor();
        System.out.println(carro2);

        carro3.ligarCarro();
        System.out.println(carro3);
    }
}
