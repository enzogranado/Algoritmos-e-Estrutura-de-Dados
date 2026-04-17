import java.util.Calendar;
import java.util.Scanner;

public class ComparaQuickMerge {
    public static void main(String[] args) {
        NossoVetor v;
        int capacidade;
        System.out.println("Digite a capacidade, 0 encerra");
        Scanner sc = new Scanner (System.in); 
        capacidade = sc.nextInt();
        while(capacidade>0){
            v = new NossoVetor(capacidade);
            v.preencheVetor();
            System.out.println(v);
            long ini = Calendar.getInstance();.getTimeInMillis();
            
        }
    }
}
