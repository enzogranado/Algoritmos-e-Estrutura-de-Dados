import java.util.Scanner;

public class TesteBusca {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor, 0 encerra: ");
        int capacidade = scanner.nextInt();
        while (capacidade>0){
            v = new NossoVetor(capacidade);
            v.preencheVetor();
            System.out.println(v);
            int x = scanner.nextInt();
            if(v.buscaLinear(x)) {
                System.out.println(x + " encontrado pela busca linear");
            } else {
                System.out.println(x + " não encontrado pela busca linear");
            }
            v.bubbleSort();
            if(v.buscaBinaria(x)){
                System.out.println(x +" encontrado pela busca binária");
            } else {
                System.out.println(x + " não encontrado pela busca binária");
            }
            System.out.println("\nDigite o tamanho do novo vetor, 0 encerra");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}
