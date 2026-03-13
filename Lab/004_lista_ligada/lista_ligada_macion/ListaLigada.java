public class ListaLigada{
    private No primeiro;
    // construtor padrão por clareza
    public ListaLigada(){
        primeiro = null;
    } 
    public boolean estaVazia(){
        return primeiro == null; 
        // quando o primeiro da lista é vazio, a lista esta vazia
    }
    public void insereInicio(int info){
        No novo = new No(info);
        if(!estaVazia()){
            novo.setProximo(primeiro);
        } 
        primeiro = novo;
    }

    public void insereFim(int info){
        No novo = new No(info);
        if(estaVazia()) primeiro = novo;
        else {
            No runner = primeiro;
            while(runner.getProximo() != null) // percorre até o ultimo
                runner = runner.getProximo();
            runner.setProximo(novo);
        } 
    }

    public int removeInicio(){
        // teste de vazia fica para a aplicação
        int temp = primeiro.getInfo(); // variavel temporaria do primeiro elemento
        primeiro = primeiro.getProximo(); // aqui pegamos o endereço do segundo
        return temp; 
    }

    public int removeFim(){
        // teste de vaZIO fica para a aplicação
        // cenário 1: Lista tem um único elemento
        int temp; // variavel temporária
        if (primeiro.getProximo() == null){
            temp = primeiro.getInfo();
            primeiro = null;
        } else{
            // cenário 2: A lista tem pelo menos 2 elementos
            No runner = primeiro;
            while (runner.getProximo().getProximo() != null) { // percorrendo até o penultimo
                runner = runner.getProximo();
            }
            temp = runner.getProximo().getInfo(); // aqui eu olhei para o penultimo, fui até o ultimo e peguei a info dele (o numero)
            runner.setProximo(null);
        }
        return temp;
    }

    public int recebeIndex(int index){
        if (index<=0) return -1;
        int pos_atual = 1;
        No runner = primeiro;
        while (runner!= null && pos_atual<index) {
            pos_atual ++;
            runner = runner.getProximo();
        } if (runner == null) // index maior que o tamanho, ele roudou a lista té nn ter mais nenhum (nulo)
            return -1;
        return runner.getInfo(); // achei a posição
    }

    @Override
    public String toString(){
        if(estaVazia()) return ("lista vazia");
        No runner = primeiro; 
        String s = "";
        while(runner!= null){ // percorre a lista até o final
            s += runner.toString();
            runner = runner.getProximo();
        }
        return s + "//"; 
    }
}