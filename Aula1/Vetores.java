package Aula1;

public class Vetores {
    private int[] vetor;
    private int ocupacao;
    private int capacidade;

    // se o usuario nn falar nada, tamanho do array é 10
    public Vetores() {
        vetor = new int[10];
        ocupacao = 0; // por clareza
        capacidade = 0;
    }

    public Vetores(int capacidadeInicial) {
        vetor = new int[capacidadeInicial];
        ocupacao = 0; // por clareza
        capacidade = capacidadeInicial;
    }

    public boolean estaVazio1() {
        if (ocupacao == 0)
            return true;
        else
            return false;
    }

    public boolean estaVazio2() {
        if (ocupacao == 0)
            return true;
        return false;
        // aqui nn presisamos obrigatriamente do else
    }

    public boolean estaVazio3() {
        return ocupacao == 0;
    }
    public boolean estavazio4() {
        return ocupacao == 0 ? true : false;
        // se for = 0 retorna true, se nao, retorna 0 
    }
    public boolean estaCheio(){
        return ocupacao == capacidade; 
    }
}
