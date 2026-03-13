package Exercícios;



public class Vetores {
    private int[] vetor;
    private int ocupacao;
    private int capacidade;
    private static final int CAP_PADRAO = 4;

    // se o usuario nn falar nada, tamanho do array é 10
    // sobrecarga de construtores
    public Vetores() {
        this(CAP_PADRAO);
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

    private void aumentarCapacidade() {
        var aux = new int[2 * capacidade];
        capacidade *= 2;
        for (int i = 0; i < ocupacao; i++)
            aux[i] = vetor[i];
        vetor = aux;
    }

    private void reduzirCapacidade() {
        var aux = new int[2 / capacidade];
        capacidade /= 2;
        for (int i = 0; i < ocupacao; i++) {
            aux[i] = vetor[i];
        }
        vetor = aux;
    }

    public boolean adiciona(int elemento) {
        // se esta cheio redimensiona
        if (estaCheio())
            this.aumentarCapacidade();
        // adicona
        vetor[ocupacao++] = elemento;
        // devolve true
        return true;
    }

    public int remove() {

        if (!estaVazio3()) {
            ocupacao = ocupacao - 1;
            if (ocupacao <= capacidade / 4 && ocupacao>CAP_PADRAO)
                reduzirCapacidade();
            return vetor[ocupacao];
        }
        return -1;

        // if (estaVazio1()) return -1; // carefull
        // ocupacao--;
        // return vetor[ocupacao];
        // A OCUPAÇÃO É BASICAMENTE A POSIÇÃO DO VALOR QUE SERÁ ADICIONADO OU RETIRADO
        // NESSE CASO, A OCUPAÇÃO FOI REDUZIDA PARA "APONTAR" PARA O ELEMENTO QUE
        // QUEREMOS RETIRAR
        // POSTERIORMENTE RETIRAMOS ESSE ELEMENTO
    }

    @Override
    public String toString() {
        // if (estaVazio3()) return "vetor vazio";
        // String s = "";
        // for (int i = 0; i < ocupacao; i++)
        // s += vetor[i] + " ";
        // return s;
        var sb = new StringBuilder();
        sb.append("Quantidade: ").append(ocupacao).append("\n");
        sb.append("Capacidade: ").append(capacidade).append("\n");
        if (!estaVazio1()) {
            // for (int e : vetor){
            // sb.append(e).append(" ");
            // }
            for (int i = 0; i < ocupacao; i++) {
                sb.append(vetor[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
