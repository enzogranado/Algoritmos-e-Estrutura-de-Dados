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
            while(runner.getProximo() != null)
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