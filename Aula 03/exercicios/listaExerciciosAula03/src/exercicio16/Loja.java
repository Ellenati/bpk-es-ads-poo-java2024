package exercicio16;

public class Loja {
    public String nome;
    public String endereco;
    public String telefone;
    public boolean aberta;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.aberta = false;
    }

    public void abrirLoja() {
        if (!aberta) {
            aberta = true;
            System.out.println("A loja '" + nome + "' foi aberta.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }

    public void fecharLoja() {
        if (aberta) {
            aberta = false;
            System.out.println("A loja '" + nome + "' foi fechada.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", aberta=" + aberta +
                '}';
    }

}

