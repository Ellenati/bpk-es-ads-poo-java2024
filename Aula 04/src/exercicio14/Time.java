package exercicio14;

import java.util.ArrayList;

public class Time {
    public String nome;
    public String tecnico;
    public int numeroDeJogadores;
    public ArrayList<String> jogadores;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
        this.numeroDeJogadores = 0;
    }

    public void adicionarJogador(String jogador) {
        jogadores.add(jogador);
        numeroDeJogadores++;
        System.out.println("Jogador " + jogador + " foi adicionado ao time " + nome);
    }

    public void removerJogador(String jogador) {
        if (jogadores.remove(jogador)) {
            numeroDeJogadores--;
            System.out.println("Jogador " + jogador + " foi removido do time " + nome);
        } else {
            System.out.println("Jogador " + jogador + " não encontrado no time.");
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", numeroDeJogadores=" + numeroDeJogadores +
                ", jogadores=" + jogadores +
                '}';
    }

}
