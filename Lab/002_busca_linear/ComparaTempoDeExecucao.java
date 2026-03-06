import java.util.Random;
import java.util.Arrays;
public class ComparaTempoDeExecucao {
    public static void go(){
        int quantidade = 100000;
        int [] vetor = new int [quantidade];
        var gerador = new Random();
        for(int i = 0; i<vetor.length;i++){
            vetor[i] = gerador.nextInt(1,1001); // Java 17
        }
        var valor = gerador.nextInt(1, 1001);
        Arrays.sort(vetor);
        System.out.println("Tempu de busca Linear:");
        var inicio = System.currentTimeMillis();
        var resultado = BuscaLinearJava.buscaLinear(vetor, valor);
        var fim = System.currentTimeMillis();

        System.out.println("Tempo de busca linear: " + (fim-inicio));

        inicio = System.currentTimeMillis();
        resultado = BuscaBinariaVetor.buscaBinaria(vetor, valor);
        fim = System.currentTimeMillis();
        System.out.printf("Tempo de busca binária: " + (fim - inicio));
    }
    public static void main(String[] args){
        go();
    }
}
 