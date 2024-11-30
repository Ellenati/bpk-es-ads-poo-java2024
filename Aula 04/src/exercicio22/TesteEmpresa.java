package exercicio22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Biopark", "99.999.999/9999-99", 10);
        empresa.contratarFuncionario();
        empresa.demitirFuncionario();
        System.out.println(empresa);
    }
}
