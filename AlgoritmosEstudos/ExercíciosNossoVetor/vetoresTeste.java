package AlgoritmosEstudos.ExercíciosNossoVetor;

import java.util.Random;
public class vetoresTeste{
    public static void main(String[]args) throws Exception{
        var nossoVetor = new Vetores();
        var gerador = new Random();
        while(true){
            // sortear um booleano chamado ehParaAdicionar:
           
            // sortear um numero de 1 a 10
            int numeroAleatorio = gerador.nextInt(1,11);
            // adicionar no nossoVetor
            // nossoVetor.adiciona(numeroAleatorio);

            int ehParaAdicionar = gerador.nextInt(1,3);
            switch (ehParaAdicionar) {
                case 1:
                    nossoVetor.adiciona(numeroAleatorio);
                    System.out.println("Adicionando... ");
                    break;
            
                case 2:
                    nossoVetor.remove();
                    System.out.println("Removendo.. ");
                    break;
            }

            // exibir o vetor
            System.out.println(nossoVetor);
            System.out.println("******");
            Thread.sleep(1000);
             
        }
    }
}