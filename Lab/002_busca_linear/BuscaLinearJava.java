import java.util.Random;
public class BuscaLinearJava {
    public static int buscaLinear(int[] vetor, int valor) {
        // fazer a busca, se encontrar devolver o indice do elemento, se n devolver o -1
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] == valor)
                return i;
        }
        return -1;
    }


    public static int quantidadeNumeroAparece(int[] vetor, int valorBuscado){
        int contador = 0;
        for(int i=0 ; i<vetor.length ; i++){
            if (valorBuscado == vetor[i]){
                contador++;
            } 
        } return contador;
        } 

    public static void main(String args[]) {



        // int[] vetor = { 4, 6, 10, 1, 2, 60, 4, 5 };
        // var resultado = buscaLinear(vetor, 1);
    // para printar cada elemento do vetor eu teria que fazer um laço for 
        // System.out.println(resultado != -1 ? "Encontrou" : "Não Encontrou");




        // preencher um vetor de 10 posições com valores entre 1 a 10
        int[] vetor = new int[10];
        var gerador = new Random();
        for (int i=0; i<10; i++){
            int numeroAleatorio = gerador.nextInt(1,11);
            vetor[i]=numeroAleatorio;
        }
        // sortear um valor a ser buscado
        int valorBuscado = gerador.nextInt(1,11);
        System.out.println("O valor que estamos buscando é: " + valorBuscado);
        // fazer a busca
       var resultado = buscaLinear(vetor, valorBuscado);
        // dizer se encontrou ou não
        System.out.println(resultado!=-1 ? "Encontou" : "Não Encontrou");
        // ajustar a busca para ela dizer quantos elementos ela encontrou no vetor
        // int contador = 0;
        // for(int i=0; i<vetor.length;i++){
        //     if (vetor[i]==valorBuscado){
        //         contador++;
        //     } 
        // }

        int quantidadeRepeticoes = quantidadeNumeroAparece(vetor, valorBuscado);
        System.out.println("Encontramos " + quantidadeRepeticoes + " numeros buscados");

        System.out.println("Conferindo: O vetor é: ");
        for(int i = 0; i<vetor.length ; i++){
            System.out.print(vetor[i] + ",");
        }
    }
}