package Aula1;
import java.util.Scanner;
public class Aula01 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner teclado = new Scanner(System.in);
        int numero; 
        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();
        if (numero%2==0){
            System.out.println("O numero é par " + numero);
        } else{
            System.out.println("o numero é impar " + numero);
        }
    }
}
