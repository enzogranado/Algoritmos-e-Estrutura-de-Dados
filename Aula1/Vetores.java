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
        // se for = 0 retorna true, se nao, retornaa 0
    }

    public boolean estaCheio() {
        return ocupacao == capacidade;
    }

    public boolean adiciona(int elemento) {
        if (estaCheio())
            return false;
        else {
            vetor[ocupacao] = elemento;
            // também podemos fazer assim: vetor[ocupacao++] = elemento;
            // dessa forma podemos omitir a linha de ocupaççao ++
            // colocamos a ocupação pois ela significa a ultima posição, nesse caso, a
            // posição 0 já que
            // nn tem nenhum elemento no array
            ocupacao++;
            // colocamos o ++ para garantir que o próximo elemento estará na proxima ocupação, próxima casinha
            return true;
        }
    }
    public int remove () {
        if (estaVazio1()) return -1; // carefull
        ocupacao--;
        return vetor[ocupacao]; 
        // A OCUPAÇÃO É BASICAMENTE A POSIÇÃO DO VALOR QUE SERÁ ADICIONADO OU RETIRADO
        // NESSE CASO, A OCUPAÇÃO FOI REDUZIDA PARA "APONTAR" PARA O ELEMENTO QUE QUEREMOS RETIRAR
        // POSTERIORMENTE RETIRAMOS ESSE ELEMENTO 
    }
    @Override
    public String toString (){
        if (estaVazio3()) return "vetor vazio";
        String s = "";
        for (int i = 0; i < ocupacao; i++)
            s += vetor[i] + " ";
        return s; 
    }
}
