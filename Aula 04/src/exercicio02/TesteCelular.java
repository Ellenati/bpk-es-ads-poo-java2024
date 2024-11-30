package exercicio02;

public class TesteCelular {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy S21", 4000);
        celular.ligar();
        System.out.println(celular);
        celular.desligar();
        System.out.println(celular);
    }
}
