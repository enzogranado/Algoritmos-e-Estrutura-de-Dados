import java.util.Arrays;
public class BuscaBinariaVetor {


    public static int buscaBinaria(int [] vetor, int valor){
        int inicio =0 , fim = vetor.length -1;
        
       int numeroMeio = vetor.length/2;
        while(valor<vetor[numeroMeio]){
            int segundoMeio = (inicio - numeroMeio)/2;
            

        }
        
    }
    public static void main(String[] args) {
        int [] numeros = {5,4,3,1,5,8,5,4};
        System.out.println("Antes da ordenação: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Depois da ordenação");
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        
    }
}
