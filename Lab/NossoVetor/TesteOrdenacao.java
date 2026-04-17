

import java.util.Calendar;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor, 0 encerra");
        int capacidade = scanner.nextInt();
        
        while(capacidade > 0){
            v = new NossoVetor(capacidade);
            
            // --- TESTE INSERTION SORT ---
            v.preencheVetor();
            System.out.println("Vetor original (Insertion): " + v);
            long ini = Calendar.getInstance().getTimeInMillis();
            v.insertion();
            long fim = Calendar.getInstance().getTimeInMillis();
            
            System.out.println("Vetor ordenado: " + v); // <-- IMPRIME ORDENADO AQUI
            System.out.println("Insertion\n capacidade : " + capacidade + "\ntempo " + (fim-ini) + " ms\n");
            
            // --- TESTE QUICKSORT ---
            v.preencheVetor();
            System.out.println("Vetor original (Quicksort): " + v);
            ini = Calendar.getInstance().getTimeInMillis();
            v.quicksort(0, capacidade - 1);
            fim = Calendar.getInstance().getTimeInMillis();
            
            System.out.println("Vetor ordenado: " + v); // <-- IMPRIME ORDENADO AQUI
            System.out.println("Quicksort\ncapacidade: " + capacidade + "\ntempo: " + (fim - ini) + " ms\n");
            
            System.out.println("-----------------------------------------");
            System.out.println("Digite a nova capacidade, 0 encerra: ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}