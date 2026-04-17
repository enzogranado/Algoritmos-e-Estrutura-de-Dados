import java.util.Arrays;
public class BuscaBinariaVetor {


    public static int buscaBinaria(int [] vetor, int valor){        
        int inicio =0 , fim = vetor.length -1;

        while(inicio<= fim){
            int meio = inicio + (fim - inicio) / 2;
            if (valor == vetor[meio]){
                return meio;
            } if (valor<vetor[meio]){
                fim = meio -1;
            }else {
                inicio = meio + 1;
            }
        }
        return -1;
        
    //    int numeroMeio = vetor.length/2;
    //    while (valor!=vetor[]) {
    //    }
    //    if (valor>vetor[numeroMeio]){
    //     int finalVetor = vetor.length -1;
    //     int novoMeio = finalVetor - numeroMeio;
    //     return vetor[novoMeio];
        
    //    } else if(valor>vetor[numeroMeio]){
    //     int finalVetor = numeroMeio - 1;
    //     int comecoVetor = 0;
    //     int novoMeio = (comecoVetor + finalVetor)/2; // redundante
    //     return vetor[novoMeio];
    //    }

        }
        
    
    public static void main(String[] args) {
        int [] numeros = {5,4,3,1,5,8,5,4};
        System.out.println("Antes da ordenação: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Depois da ordenação");
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        int valor = 11;
        var indice = buscaBinaria(numeros, valor);
        System.out.printf("%s\n", indice < 0 ? "Não encontrado" : " Encontrado em " + indice);
        
    }
}

