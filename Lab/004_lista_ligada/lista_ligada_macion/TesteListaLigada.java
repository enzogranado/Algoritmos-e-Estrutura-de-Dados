public class TesteListaLigada {
    public static void main(String[]args) {
        ListaLigada ll = new ListaLigada();
        System.out.println("lista inicializada: " + ll);
        ll.insereInicio(3);
        ll.insereInicio(7);
        ll.insereInicio(32);
        System.out.println("lista depois das inserções de inicio:\n" + ll);
        if (ll.estaVazia())
            System.out.println("lista vazia, não há o que remover");
        else {
            System.out.println(ll.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remoção de inicio: " + ll);

        }
        ll.insereFim(100);
        ll.insereFim(200);
        ll.insereFim(300);
        System.out.println("lista depois das adições no fim");
        System.out.println(ll);
    }
}